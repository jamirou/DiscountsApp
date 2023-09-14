package com.jamirodev.discountsapp.viewModels

import androidx.lifecycle.ViewModel


class OperationViewModel1: ViewModel() {

    fun calculate(price: String, discount: String): Pair<Double, Pair<Double, Boolean>> {
        var priceDiscount = 0.0
        var totalDiscount = 0.0
        var showAlert = false
        if (price != "" && discount != ""){
            priceDiscount = priceCalc(price.toDouble(), discount.toDouble())
            totalDiscount = discountCalc(price.toDouble(), discount.toDouble())
        }else {
            showAlert = true
        }
        return Pair(priceDiscount, Pair(totalDiscount, showAlert))
    }

    private fun priceCalc(price: Double, discount: Double): Double {
        val res = price - discountCalc(price, discount)
        return kotlin.math.round(res * 100) / 100.0
    }

    private fun discountCalc(price: Double, discount: Double): Double {
        val res = price * (1-discount / 100)
        return kotlin.math.round(res * 100) / 100.0
    }
}