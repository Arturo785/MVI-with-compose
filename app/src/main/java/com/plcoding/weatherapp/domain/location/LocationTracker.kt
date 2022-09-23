package com.plcoding.weatherapp.domain.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location? // not really domain because of android but for
    // simplicity is ok
}