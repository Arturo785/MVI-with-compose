package com.plcoding.weatherapp.di

import com.plcoding.weatherapp.data.location.DefaultLocationTracker
import com.plcoding.weatherapp.data.repository.WeatherRepositoryImpl
import com.plcoding.weatherapp.domain.location.LocationTracker
import com.plcoding.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


// when we own the implementation its better and lightweight to use bind instead of provide
@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}