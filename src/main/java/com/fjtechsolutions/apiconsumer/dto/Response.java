package com.fjtechsolutions.apiconsumer.dto;

import lombok.Data;

import java.util.List;


@Data
public class Response {

   private Coordinate coord;
   private List<Weather> weather;
   private String base;
   private MainDetails main;
   private Integer visibility;
   private Wind wind;
   private Clouds clouds;
   private SystemDetails sys;
    private Long dt;
    //sys
    private long timezone;
    private Long id;
    private String name;
    private Integer cod;

}
