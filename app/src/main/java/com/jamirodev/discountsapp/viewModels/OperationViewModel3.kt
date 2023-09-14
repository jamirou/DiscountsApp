package com.jamirodev.discountsapp.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.jamirodev.discountsapp.model.CalculateState

class OperationViewModel3: ViewModel() {
    var state by mutableStateOf(CalculateState())
        private set

    fun onValue(value: String, text:String) {
        when(text) {
            "price" -> state = state.copy(price = value)
            "discount" -> state = state.copy(discount = value)
        }
    }
}