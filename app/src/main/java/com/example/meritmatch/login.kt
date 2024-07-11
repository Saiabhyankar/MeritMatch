package com.example.meritmatch

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

private val retrofit=Retrofit.Builder().baseUrl("http://127.0.0.1:8080/").addConverterFactory(GsonConverterFactory.create()).build()
val client= retrofit.create(Login::class.java)
interface Login {
    @POST("insert")
    fun postUserDetails(@Body userDetails: UserDetails): Call<Void>

    @GET("getUserName")
    suspend fun getExistingUser():UserAuth
}
