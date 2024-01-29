package com.fjtechsolutions.apiconsumer.dto;

import lombok.Data;

@Data
public class SystemDetails {
   private Integer  type;
   private Long id;
   private String country;
   private Long sunrise;
   private Long sunset;
}
