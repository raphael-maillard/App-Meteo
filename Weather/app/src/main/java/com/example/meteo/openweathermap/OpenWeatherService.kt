package com.example.meteo.openweathermap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "7fc41fc637a8312deb794c4ffd5a28e9"

interface OpenWeatherService {

    @GET("data/2.5/weather?units=metric&lang=fr")
    fun getWeather(@Query ("q") cityName: String,
                   @Query ("appid") apiKey: String = API_KEY) : Call<WeatherWrapper>
}