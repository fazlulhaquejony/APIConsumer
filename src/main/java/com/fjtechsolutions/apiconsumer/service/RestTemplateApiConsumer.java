package com.fjtechsolutions.apiconsumer.service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fjtechsolutions.apiconsumer.dto.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;


public class RestTemplateApiConsumer {

    private ObjectMapper objectMapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);



     public Response consumeApi() throws IOException {
         String apiKey ="e035ca5c00b6f72b3e2447c49dd92c57";
         String url ="https://api.openweathermap.org/data/2.5/weather?q=Dhaka&appid="+apiKey;
         RestTemplate restTemplate = new RestTemplate();
         System.out.println("data==>1st api===>");
         String responseData = restTemplate.getForObject(url,String.class);

         Response response = objectMapper.readValue(responseData, Response.class);

         List<Weather> weather = response.getWeather();
         Clouds  clouds = response.getClouds();
         MainDetails mainDetails = response.getMain();
         SystemDetails systemDetails = response.getSys();


         System.out.println("weather==>"+ weather);
         System.out.println("systemDetails==>"+ systemDetails);
         System.out.println("mainDetails==>"+ mainDetails);
         System.out.println("clouds==>"+ clouds);
         System.out.println("Response==>"+ response);
         System.out.println("responseData==>"+ responseData);



         return response;

     }

}
