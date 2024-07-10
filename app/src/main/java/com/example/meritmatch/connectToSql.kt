package com.example.meritmatch

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

private val retrofit=Retrofit.Builder().baseUrl("http://127.0.0.1:5000").addConverterFactory(GsonConverterFactory.create()).build()
val backendResponse: Backend = retrofit.create(Backend::class.java)
interface Backend {
    @POST("/loginUserName")
    suspend fun putUserName(@Body details:UserDetails)

}