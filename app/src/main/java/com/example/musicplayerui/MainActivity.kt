package com.example.musicplayerui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import com.example.musicplayerui.ui.theme.MusicPlayerUITheme
import com.example.musicplayerui.ui.theme.MusicUI
import androidx.compose.material3.Scaffold as Scaffold1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicPlayerUITheme  {
                Scaffold1(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MusicUI(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}