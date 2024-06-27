package com.example.hilt_compose.model

import javax.inject.Inject

data class Combustivel @Inject constructor(
    val combustivel: String
)