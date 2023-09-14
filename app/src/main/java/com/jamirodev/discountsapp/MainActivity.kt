package com.jamirodev.discountsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jamirodev.discountsapp.ui.theme.DiscountsAppTheme
import com.jamirodev.discountsapp.viewModels.OperationViewModel1
import com.jamirodev.discountsapp.viewModels.OperationViewModel2
import com.jamirodev.discountsapp.views.HomeView
import com.jamirodev.discountsapp.views.HomeView2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: OperationViewModel2 by viewModels()
        setContent {
            DiscountsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeView2(viewModel)
                }
            }
        }
    }
}

