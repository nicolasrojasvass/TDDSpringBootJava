package com.vass.springboot.tdd.service;

import com.vass.springboot.tdd.controller.weather.dto.WeatherReportDto;
import com.vass.springboot.tdd.repository.document.GeoLocation;
import com.vass.springboot.tdd.repository.document.WeatherReport;

import java.util.List;

public interface WeatherService
{
    WeatherReport report( WeatherReportDto weatherReportDto );

    WeatherReport findById( String id );

    List<WeatherReport> findNearLocation(GeoLocation geoLocation, float distanceRangeInMeters );

    List<WeatherReport> findWeatherReportsByName( String reporter );

}
