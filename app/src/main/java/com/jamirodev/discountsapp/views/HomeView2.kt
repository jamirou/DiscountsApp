package com.jamirodev.discountsapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jamirodev.discountsapp.components.Alert
import com.jamirodev.discountsapp.components.Cards
import com.jamirodev.discountsapp.components.MainButton
import com.jamirodev.discountsapp.components.MainTextField
import com.jamirodev.discountsapp.components.SpaceH
import com.jamirodev.discountsapp.ui.theme.Primary
import com.jamirodev.discountsapp.viewModels.OperationViewModel1
import com.jamirodev.discountsapp.viewModels.OperationViewModel2

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView2(viewModel2: OperationViewModel2) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(
            title = { Text(text = "Discounts app", color = Color.Black) },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                containerColor = Primary
            )
        )
    }) {
        ContentHomeView2(it, viewModel2)
    }
}

@Composable
fun ContentHomeView2(paddingValues: PaddingValues, viewModel2: OperationViewModel2) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .padding(10.dp)
            .fillMaxSize(),
        //verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var price by remember { mutableStateOf("") }
        var discount by remember { mutableStateOf("") }
        var priceDiscount by remember { mutableStateOf(0.0) }
        var totalDiscount by remember { mutableStateOf(0.0) }
        var showAlert by remember { mutableStateOf(false) }

        Cards(
            title1 = "Total:",
            number1 = totalDiscount,
            title2 = "Discount:",
            number2 = priceDiscount)

        SpaceH(20.dp)
        MainTextField(value = price, onValueChange = { price = it }, label = "Price:")
        SpaceH()
        MainTextField(value = discount, onValueChange = { discount = it }, label = "Discount %")
        SpaceH(10.dp)
        MainButton(text = "Generate discount", color = Color.Black) {

        }
        SpaceH()
        MainButton(text = "Clear", color = Color.Red) {
            price = ""
            discount = ""
            priceDiscount = 0.0
            totalDiscount = 0.0
        }

        if (showAlert) {
            Alert(title = "Alert",
                message = "Must fill the fields to continue",
                confirmText = "ok",
                onConfirmClick = { showAlert = false }) { }
        }
    }
}
