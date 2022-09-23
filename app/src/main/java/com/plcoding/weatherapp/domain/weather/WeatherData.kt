package com.plcoding.weatherapp.domain.weather

import java.time.LocalDateTime

// the one that is used in the domain and gets the data from the DTO mapped data from the data package
data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)