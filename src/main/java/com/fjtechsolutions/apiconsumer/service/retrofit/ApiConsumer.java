package com.fjtechsolutions.apiconsumer.service.retrofit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fjtechsolutions.apiconsumer.dto.*;
import retrofit2.Response;

import java.util.List;

public class ApiConsumer {

    private final ScalarApiClient  scalarApiClient;
    private final ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .setDefaultPropertyInclusion(JsonInclude.Include.ALWAYS);

     private Response response;
    public ApiConsumer(ScalarApiClient scalarApiClient) {
        this.scalarApiClient = scalarApiClient;
    }



    public ResponseRetrofit getApiDetails() throws Exception
    {
       Response<String> response = scalarApiClient.getApiResponse("json").execute();
        ResponseRetrofit responseRetrofit = new ResponseRetrofit();
       if(response.isSuccessful())
       {
           responseRetrofit = objectMapper.readValue(response.body(), ResponseRetrofit.class);
           System.out.println("responseRetrofit==>"+responseRetrofit);
       }
        List<Weather> weather = responseRetrofit.getWeather();
        Clouds clouds = responseRetrofit.getClouds();
        MainDetails mainDetails = responseRetrofit.getMain();
        SystemDetails systemDetails = responseRetrofit.getSys();

        System.out.println("weather==>"+ weather);
        System.out.println("systemDetails==>"+ systemDetails);
        System.out.println("mainDetails==>"+ mainDetails);
        System.out.println("clouds==>"+ clouds);


       return  responseRetrofit;

    }


}
