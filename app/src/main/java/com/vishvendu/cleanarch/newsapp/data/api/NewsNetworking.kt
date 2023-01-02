package com.vishvendu.cleanarch.newsapp.data.api


import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsNetworking {

    const val apiKey = "f3625c6afa4f486e9ad5d25293a6f4b2"
    fun create(baseurl : String) : NetworkService {

       return Retrofit.Builder()
            .baseUrl(baseurl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(
               OkHttpClient.Builder()
               .addInterceptor (APIKeyInterceptor())
               .build())
            .build()
            .create(NetworkService::class.java)
    }
}