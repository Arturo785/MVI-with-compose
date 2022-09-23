package com.plcoding.weatherapp.domain.weather


// the one that is used in the domain and gets the data from the DTO mapped data from the data package
data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)