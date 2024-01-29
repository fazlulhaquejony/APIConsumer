package com.fjtechsolutions.apiconsumer.service.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ScalarApiClient {

    @FormUrlEncoded
    @POST("weather?q=Dhaka&appid=3b1cbb233338799f84c980bcc9d738a4")
    Call<String> getApiResponse(@Field("json") String mJson);
}
