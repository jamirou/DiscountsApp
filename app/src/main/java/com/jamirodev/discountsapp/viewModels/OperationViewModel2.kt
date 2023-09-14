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

    var priceDiscount by mutableStateOf(0.0)
        private set

    var totalDiscount by mutableStateOf(0.0)
        private set

    var showAlert by mutableStateOf(false)
        private set

}