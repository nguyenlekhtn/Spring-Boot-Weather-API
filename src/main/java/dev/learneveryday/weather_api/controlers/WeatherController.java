package dev.learneveryday.weather_api.controlers;

import dev.learneveryday.weather_api.dtos.WeatherDto;
import dev.learneveryday.weather_api.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping(value = "/{location}", produces = "application/json")
    public WeatherDto.Response getWeatherByLocation(@PathVariable String location) {
        return weatherService.getWeatherByLocation(location);
    }
}
