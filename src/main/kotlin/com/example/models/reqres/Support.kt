package com.example.models.reqres

import kotlinx.serialization.Serializable

@Serializable
data class Support(
    val text: String,
    val url: String
)