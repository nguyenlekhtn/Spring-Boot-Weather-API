package dev.learneveryday.weather_api.clients;

import dev.learneveryday.weather_api.dtos.WeatherDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "visualcrossing", url="https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/")
public interface VisualCrossingFeignClient {

    @GetMapping("/timeline/{location}/next7days?unitGroup=metric&include=days&key={apiKey}&contentType=json")
    WeatherDto.Response getWeatherByLocation(@PathVariable String location, @PathVariable String apiKey);
}
