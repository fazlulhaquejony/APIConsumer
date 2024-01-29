package com.fjtechsolutions.apiconsumer.controller;

import com.fjtechsolutions.apiconsumer.dto.Response;
import com.fjtechsolutions.apiconsumer.dto.ResponseRetrofit;
import com.fjtechsolutions.apiconsumer.service.RestTemplateApiConsumer;
import com.fjtechsolutions.apiconsumer.service.retrofit.ApiConsumer;
import com.fjtechsolutions.apiconsumer.service.retrofit.RestApiRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiConsumerController {


    @GetMapping("/getData")
    public Response userLogin() throws Exception
    {
        RestTemplateApiConsumer restTemplateApiConsumer = new RestTemplateApiConsumer();
       // System.out.println("Login Started===>"+restTemplateApiConsumer.consumeApi());

        return  restTemplateApiConsumer.consumeApi();
    }

    @GetMapping("/getDataRetrofit")
    public ResponseRetrofit userData() throws Exception
    {
        //RestTemplateApiConsumer restTemplateApiConsumer = new RestTemplateApiConsumer();
        // System.out.println("Login Started===>"+restTemplateApiConsumer.consumeApi());
        RestApiRepository restApiRepository = new RestApiRepository();
        ApiConsumer apiConsumer= restApiRepository.getApiConsuming();

        return apiConsumer.getApiDetails();
    }
}
