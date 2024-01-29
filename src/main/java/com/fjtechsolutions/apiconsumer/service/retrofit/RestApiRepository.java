package com.fjtechsolutions.apiconsumer.service.retrofit;

public class RestApiRepository {

    public ApiConsumer getApiConsuming()
    {
        ApiConsumer apiConsumer = new ApiConsumer(new RetrofitScalarClient().getClient(BaseDetails.BASE_URL).create(ScalarApiClient.class));
        return apiConsumer;

    }
}
