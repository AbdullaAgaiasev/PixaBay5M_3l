package com.example.pixabay5m_3l

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

//https://pixabay.com/api/
interface PixaApi {

    @GET("api/")
    fun getImage(@Query("key") key : String = "33921092-684893a004d9ac755f773f938",
                 @Query("q") keyWord : String,
                 @Query("per_page") perPage : Int = 3,
                 @Query("page") page : Int = 1
    ) : Call<PixaModel>

}