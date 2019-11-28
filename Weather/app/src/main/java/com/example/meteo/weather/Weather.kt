package com.example.meteo.weather

data class Weather(
    val description: String,
    val temperature: Float,
    val humidity: Int,
    val iconUrl: String,
    val pressure: Int
)
