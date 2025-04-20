package dev.learneveryday.weather_api.dtos;

import java.util.List;

public interface WeatherDto {
    record Response(
            String resolvedAddress,
            String timezone,
            Integer tzoffset,
            List<DayWeather> days
    ) {}

    record DayWeather(
            String datetime,
            Double temp,
            String conditions,
            String description
    ) {}

    record CurrentConditions(
            String datetime,
            Double temp
    ) {}
}
