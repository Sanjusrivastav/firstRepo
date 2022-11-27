package com.example.recyclerviewdataclass

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET



interface QuotesAPI {

    @GET("posts")
    fun getQuotes(): Call<List<MyDataClass>>

}

