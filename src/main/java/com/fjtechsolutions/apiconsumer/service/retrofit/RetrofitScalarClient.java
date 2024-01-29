package com.fjtechsolutions.apiconsumer.service.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitScalarClient {

    public Retrofit getClient(String baseUrl)
    {
        return  new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();

    }

}
