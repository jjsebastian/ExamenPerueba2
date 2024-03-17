package com.utad.examenprueba2.data.network.model

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface SchoolService {
    @GET("homeWork/{school}")
    suspend fun getHomeWork(
        @Header("Authorization")userName: String,
        @Path("school")school:String
    ): Response<List<HomeWorkResponse>>
}