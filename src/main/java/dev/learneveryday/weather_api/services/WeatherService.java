package dev.learneveryday.weather_api.services;

import dev.learneveryday.weather_api.dtos.WeatherDto;

public interface WeatherService {
    public WeatherDto.Response getWeatherByLocation(String location);
}
