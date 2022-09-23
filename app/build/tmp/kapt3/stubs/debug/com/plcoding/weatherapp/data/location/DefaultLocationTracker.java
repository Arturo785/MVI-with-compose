package com.plcoding.weatherapp.data.location;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/plcoding/weatherapp/data/location/DefaultLocationTracker;", "Lcom/plcoding/weatherapp/domain/location/LocationTracker;", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "application", "Landroid/app/Application;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/app/Application;)V", "getCurrentLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DefaultLocationTracker implements com.plcoding.weatherapp.domain.location.LocationTracker {
    private final com.google.android.gms.location.FusedLocationProviderClient locationClient = null;
    private final android.app.Application application = null;
    
    @javax.inject.Inject()
    public DefaultLocationTracker(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient locationClient, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
}