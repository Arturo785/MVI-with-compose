package com.plcoding.weatherapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/plcoding/weatherapp/data/repository/WeatherRepositoryImpl;", "Lcom/plcoding/weatherapp/domain/repository/WeatherRepository;", "api", "Lcom/plcoding/weatherapp/data/remote/WeatherApi;", "(Lcom/plcoding/weatherapp/data/remote/WeatherApi;)V", "getWeatherData", "Lcom/plcoding/weatherapp/domain/util/Resource;", "Lcom/plcoding/weatherapp/domain/weather/WeatherInfo;", "lat", "", "long", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WeatherRepositoryImpl implements com.plcoding.weatherapp.domain.repository.WeatherRepository {
    private final com.plcoding.weatherapp.data.remote.WeatherApi api = null;
    
    @javax.inject.Inject()
    public WeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.plcoding.weatherapp.data.remote.WeatherApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWeatherData(double lat, double p1_1663806, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.plcoding.weatherapp.domain.util.Resource<com.plcoding.weatherapp.domain.weather.WeatherInfo>> continuation) {
        return null;
    }
}