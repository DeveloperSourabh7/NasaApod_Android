package com.example.nasaapod.repository

import com.example.nasaapod.api.NasaService
import com.example.nasaapod.utils.Resource
import com.example.nasaapod.utils.Resource.*
import persistent.app.mynasa.DataClassModel.MyNasa

class NasaRepository constructor(
    private val api: NasaService
) {
    suspend fun getNasaImageByCount(apikey: String,count: String): Resource<List<MyNasa>> {
        val response = try {
            api.getNasaImage(apikey, count)
        } catch(e: Exception) {
            return Error("An unknown error occured.")
        }
        return Success(response)
    }

    suspend fun getNasaImageByDate(apikey: String,startDate: String, endDate: String): Resource<List<MyNasa>> {
        val response = try {
            api.getNasaImageDate(apikey, startDate, endDate)
        } catch(e: Exception) {
            return Error("An unknown error occured.")
        }
        return Success(response)
    }
}