package com.rar.devs.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import com.ramcosta.composedestinations.DestinationsNavHost
import com.rar.devs.calculator.ui.theme.CalculatorPrepTheme

@ExperimentalComposeUiApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorPrepTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}