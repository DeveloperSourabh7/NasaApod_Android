package com.example.nasaapod.api


import persistent.app.mynasa.DataClassModel.MyNasa
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NasaService {
    @GET("apod")
    suspend fun getNasaImage(
        @Query(value = "api_key") api_key: String?,
        @Query(value = "count") count: String?
    ): List<MyNasa>

    @GET("apod")
    suspend fun getNasaImageDate(
        @Query(value = "api_key") api_key: String?,
        @Query(value = "start_date") start_date: String?,
        @Query(value = "end_date") end_date: String?
    ): List<MyNasa>
}