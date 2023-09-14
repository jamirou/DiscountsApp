package com.jamirodev.discountsapp.model

data class CalculateState(
    val price: String = "",
    val discount: String = "",
    val priceDiscount: Double = 0.0,
    val totalDiscount: Double = 0.0,
    val showAlert: Boolean = false
)
