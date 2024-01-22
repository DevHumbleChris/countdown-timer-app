package com.example.countdowntimer.app

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.countdowntimer.viewmodel.CountdownTimerViewModel
import kotlinx.coroutines.delay

@Composable
fun CountdownTimerApp(viewModel: CountdownTimerViewModel) {
    var timeLeft by remember {
        mutableIntStateOf(60)
    }

    LaunchedEffect(key1 = timeLeft) {
        while (timeLeft > 0) {
            delay(1000L)
            timeLeft--
        }

    }
    Text(text = "Time-left : $timeLeft")
    Button(onClick = {
        viewModel.changeBackgroundColor()
    }) {
        Text(text = "Change Color")
    }
}