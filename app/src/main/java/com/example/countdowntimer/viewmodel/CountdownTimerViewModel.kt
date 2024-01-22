package com.example.countdowntimer.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class CountdownTimerViewModel: ViewModel() {
    var _background by mutableStateOf(Color.White)
        private set

    fun changeBackgroundColor() {
        _background = Color.Green
    }
}