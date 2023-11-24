package com.example.pixabay5m_3l

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofiltService {

    private val retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    val api = retrofit.create(PixaApi::class.java)
}