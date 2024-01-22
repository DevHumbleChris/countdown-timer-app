package com.example.countdowntimer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.countdowntimer.app.CountdownTimerApp
import com.example.countdowntimer.ui.theme.CountdownTimerTheme
import com.example.countdowntimer.viewmodel.CountdownTimerViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<CountdownTimerViewModel> ()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountdownTimerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel._background
                ) {
                    CountdownTimerApp(viewModel)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CountdownTimerTheme {
        CountdownTimerApp(viewModel())
    }
}