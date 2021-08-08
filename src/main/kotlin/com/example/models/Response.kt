package com.example.models


import kotlinx.serialization.Serializable

@Serializable
data class Response (
    val status : Boolean,
    val data : Customer,
    val pesan : String
    )

