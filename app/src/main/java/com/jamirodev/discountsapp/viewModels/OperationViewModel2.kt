package com.jamirodev.discountsapp.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class OperationViewModel2 : ViewModel() {

    var price by mutableStateOf("")
        private set
    var discount by mutableStateOf("")
        private set

    fun onValue(value: String, text: String) {
        when (text) {
            "price" -> price = value
            "discount" -> discount = value
        }
    }

    var priceDiscount by mutableStateOf(0.0)
        private set

    var totalDiscount by mutableStateOf(0.0)
        private set

    var showAlert by mutableStateOf(false)
        private set


    fun calculate() {

        if (price != "" && discount != "") {
            priceDiscount = priceCalc(price.toDouble(), discount.toDouble())
            totalDiscount = discountCalc(price.toDouble(), discount.toDouble())
        } else {
            showAlert = true
        }
    }
    private fun priceCalc(price: Double, discount: Double): Double {
        val res = price - discountCalc(price, discount)
        return kotlin.math.round(res * 100) / 100.0
    }

    private fun discountCalc(price: Double, discount: Double): Double {
        val res = price * (1 - discount / 100)
        return kotlin.math.round(res * 100) / 100.0
    }
    fun clear() {
        price = ""
        discount = ""
        priceDiscount = 0.0
        totalDiscount = 0.0
    }

    fun cancelAlert() {
        showAlert = false
    }

}