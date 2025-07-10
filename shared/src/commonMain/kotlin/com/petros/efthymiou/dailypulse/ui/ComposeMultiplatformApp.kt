package com.petros.efthymiou.dailypulse.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.petros.efthymiou.dailypulse.ui.screens.AboutScreen

@Composable
fun App() {
    MaterialTheme {
        Scaffold {
            Box(modifier = Modifier.fillMaxSize()) {
                AboutScreen()
            }
        }
    }
}
