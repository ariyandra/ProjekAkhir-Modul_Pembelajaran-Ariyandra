package com.projekmodul.fetchapi

import com.projekmodul.ResponseModul
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("modul/1")
    fun getmodul1 () : Call<ResponseModul>

}