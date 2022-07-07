package com.vass.springboot.tdd.repository;

import com.vass.springboot.tdd.repository.document.WeatherReport;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherReportRepository
    extends MongoRepository<WeatherReport, String>
{
}
