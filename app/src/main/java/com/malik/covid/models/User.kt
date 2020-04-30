package com.malik.covid.models

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("firstName")
    val firstName: String = "",
    @SerializedName("lastName")
    val lastName: String = "",
    @SerializedName("_id")
    val Id: String = "",
    @SerializedName("email")
    val email: String = "",
    @SerializedName("token")
    val token: String = ""
) : BaseError()


