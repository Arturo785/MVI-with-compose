package com.plcoding.weatherapp.presentation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/plcoding/weatherapp/presentation/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/plcoding/weatherapp/domain/repository/WeatherRepository;", "locationTracker", "Lcom/plcoding/weatherapp/domain/location/LocationTracker;", "(Lcom/plcoding/weatherapp/domain/repository/WeatherRepository;Lcom/plcoding/weatherapp/domain/location/LocationTracker;)V", "<set-?>", "Lcom/plcoding/weatherapp/presentation/WeatherState;", "state", "getState", "()Lcom/plcoding/weatherapp/presentation/WeatherState;", "setState", "(Lcom/plcoding/weatherapp/presentation/WeatherState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "loadWeatherInfo", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    private final com.plcoding.weatherapp.domain.repository.WeatherRepository repository = null;
    private final com.plcoding.weatherapp.domain.location.LocationTracker locationTracker = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject()
    public WeatherViewModel(@org.jetbrains.annotations.NotNull()
    com.plcoding.weatherapp.domain.repository.WeatherRepository repository, @org.jetbrains.annotations.NotNull()
    com.plcoding.weatherapp.domain.location.LocationTracker locationTracker) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.plcoding.weatherapp.presentation.WeatherState getState() {
        return null;
    }
    
    private final void setState(com.plcoding.weatherapp.presentation.WeatherState p0) {
    }
    
    public final void loadWeatherInfo() {
    }
}