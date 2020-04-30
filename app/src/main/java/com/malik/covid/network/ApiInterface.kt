package com.malik.covid.network

import com.malik.covid.models.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("")
    fun uploadData(@Body body: HashMap<String, Any>): Call<User>
}
