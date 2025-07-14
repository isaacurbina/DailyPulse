package com.petros.efthymiou.dailypulse.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.petros.efthymiou.dailypulse.ui.App
import com.petros.efthymiou.dailypulse.ui.MyApplicationTheme

class MainActivity : ComponentActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		Log.i("MainActivity", "onCreate() was called")
		setContent {
			MyApplicationTheme {
				Surface(
					modifier = Modifier
                        .fillMaxSize()
						.background(Color.Gray.copy(alpha = 0.1f))
                        .padding(16.dp)
                        .background(Color.White),
					color = MaterialTheme.colorScheme.background
				) {
					App()
				}
			}
		}
	}

	override fun onResume() {
		super.onResume()
		Log.d("MainActivity", "onResume() was called")
	}
}
