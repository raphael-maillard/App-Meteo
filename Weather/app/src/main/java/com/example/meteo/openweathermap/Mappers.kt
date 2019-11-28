package com.example.meteo.openweathermap

import com.example.meteo.weather.Weather

fun mapOpenWeatherDataToWeather (weatherWrapper: WeatherWrapper) : Weather {
    val weatherFirst = weatherWrapper.weather.first()

        return Weather(
                description = weatherFirst.description,
                temperature = weatherWrapper.main.temperature,
                humidity = weatherWrapper.main.humidity,

            //Si problème peut-être avec le pressure obligé de mettre Alt+Enter ...
                pressure = weatherWrapper.main.pressure,
                iconUrl = "https://openweathermap.org/img/wn/${weatherFirst.icon}.png"
                )


}