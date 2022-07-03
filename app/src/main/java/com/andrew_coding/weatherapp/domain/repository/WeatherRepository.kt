package com.andrew_coding.weatherapp.domain.repository

import com.andrew_coding.weatherapp.domain.util.Resource
import com.andrew_coding.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}