package dev.learneveryday.weather_api.services;

import dev.learneveryday.weather_api.clients.VisualCrossingFeignClient;
import dev.learneveryday.weather_api.dtos.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherDataService implements WeatherService {

    private final VisualCrossingFeignClient visualCrossingFeignClient;

    @Value("${visual-crossing.api-key}")
    private String apiKey;

    @Override
    public WeatherDto.Response getWeatherByLocation(String location) {
        return visualCrossingFeignClient.getWeatherByLocation(location, apiKey);
    }
}
