package com.example.proyecto4.model


import com.google.gson.annotations.SerializedName

data class Request(
    @SerializedName("cnt")
    val cnt: Int,
    @SerializedName("list")
    val list: List<X>
)