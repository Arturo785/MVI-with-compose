package com.plcoding.weatherapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/plcoding/weatherapp/data/remote/WeatherApi;", "", "getWeatherData", "Lcom/plcoding/weatherapp/data/remote/WeatherDto;", "lat", "", "long", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    public abstract java.lang.Object getWeatherData(@retrofit2.http.Query(value = "latitude")
    double lat, @retrofit2.http.Query(value = "longitude")
    double p1_1663806, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.plcoding.weatherapp.data.remote.WeatherDto> continuation);
}