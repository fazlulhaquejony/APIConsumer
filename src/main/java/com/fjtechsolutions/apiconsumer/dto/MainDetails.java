package com.fjtechsolutions.apiconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MainDetails {

    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;
    @JsonProperty("temp_min")
    private double tempMin;
    @JsonProperty("temp_max")
    private double temp_min;
    private Integer pressure;
    private Integer humidity;


}
