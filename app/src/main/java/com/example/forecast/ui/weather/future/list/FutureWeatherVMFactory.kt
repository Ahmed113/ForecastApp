package com.example.forecast.ui.weather.future.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.forecast.data.repository.WeatherRepository
import kotlinx.coroutines.DelicateCoroutinesApi

class FutureWeatherVMFactory(private val weatherRepository: WeatherRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @OptIn(DelicateCoroutinesApi::class)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FutureWeatherViewModel(weatherRepository) as T
    }

}