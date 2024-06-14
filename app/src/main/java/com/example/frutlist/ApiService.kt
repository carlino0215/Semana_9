package com.example.frutlist

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getFrutByType(@Url url:String):Response<FrutsResponse>
}