package com.petros.efthymiou.dailypulse.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import com.petros.efthymiou.dailypulse.ui.screens.ArticlesScreen

@Composable
fun App() {
    MyApplicationTheme {
		Surface(
			modifier = Modifier.fillMaxSize(),
			color = MaterialTheme.colorScheme.background
		) {
			Navigator(ArticlesScreen())
		}
        Scaffold {
            Box(modifier = Modifier.fillMaxSize()) {
				Text("Hello world")
			}
        }
    }
}
