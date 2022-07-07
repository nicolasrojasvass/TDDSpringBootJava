package com.vass.springboot.tdd.service;

import com.vass.springboot.tdd.controller.weather.dto.WeatherReportDto;
import com.vass.springboot.tdd.repository.WeatherReportRepository;
import com.vass.springboot.tdd.repository.document.GeoLocation;
import com.vass.springboot.tdd.repository.document.WeatherReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoWeatherService
    implements WeatherService
{

    private final WeatherReportRepository repository;

    public MongoWeatherService( @Autowired WeatherReportRepository repository )
    {
        this.repository = repository;
    }

    @Override
    public WeatherReport report(WeatherReportDto weatherReportDto )
    {
        return null;
    }

    @Override
    public WeatherReport findById( String id )
    {
        throw new RuntimeException( "Implement this method" );
    }

    @Override
    public List<WeatherReport> findNearLocation(GeoLocation geoLocation, float distanceRangeInMeters )
    {
        return null;
    }

    @Override
    public List<WeatherReport> findWeatherReportsByName( String reporter )
    {
        return null;
    }
}
