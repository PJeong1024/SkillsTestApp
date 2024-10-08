package com.jdw.skillstestapp.data.network

import com.jdw.skillstestapp.BuildConfig
import com.jdw.skillstestapp.data.model.weather.WeatherData
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface WeatherApi {

    //    https://api.openweathermap.org/data/2.5/weather?lat=37.447551&lon=126.709306&appid=62032341a80cfde57b781bf121793c22
    //    {"coord":{"lon":126.7093,"lat":37.4476},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04d"}],"base":"stations","main":{"temp":293.56,"feels_like":293.07,"temp_min":293.56,"temp_max":293.56,"pressure":1017,"humidity":54,"sea_level":1017,"grnd_level":1015},"visibility":10000,"wind":{"speed":3.58,"deg":324,"gust":4.15},"clouds":{"all":100},"dt":1728274438,"sys":{"country":"KR","sunrise":1728250419,"sunset":1728292084},"timezone":32400,"id":1843564,"name":"Incheon","cod":200}

    @GET(value = "data/2.5/weather")
    suspend fun getWeather(
        @Query(value = "lat") lat: String,
        @Query(value = "lon") lon: String,
        @Query(value = "appid") appid: String = BuildConfig.OPEN_WEATHER_API_KEY,
        @Query(value = "units") units: String = "metric",
    ): WeatherData


}