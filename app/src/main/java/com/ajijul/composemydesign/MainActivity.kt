package com.ajijul.composemydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ajijul.composemydesign.ui.theme.ComposeMyDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val color1 = mutableStateOf(Color.Green)
            val color2 = mutableStateOf(Color.Blue)
            Column(modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(30.dp)) {
                MyColorBox1(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize(), ownColor = color1, otherColor = color2
                )
                Spacer(modifier = Modifier.height(30.dp))
                MyColorBox2(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize(), ownColor = color2, otherColor = color1
                )
            }
        }
    }
}