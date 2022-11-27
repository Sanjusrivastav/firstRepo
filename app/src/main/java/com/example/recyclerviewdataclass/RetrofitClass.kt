package com.example.recyclerviewdataclass

import android.util.Log
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

fun getData(){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(QuotesAPI::class.java  )
     val news = retrofit.getQuotes ()
    news.enqueue(object :Callback<List <MyDataClass >>{
        override fun onResponse(
            call: Call<List<MyDataClass>>,
            response: Response<List<MyDataClass>>
        ) { val news = response .body()
            Log.d("Nestaap","response")

        }
        override fun onFailure(call: Call<List<MyDataClass>>, t: Throwable) {
            Log.d("Nestaap","error")

        }

    } )
    }






