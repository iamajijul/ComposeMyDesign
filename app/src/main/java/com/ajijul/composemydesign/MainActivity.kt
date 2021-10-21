package com.ajijul.composemydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ajijul.composemydesign.ui.theme.ComposeMyDesignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter1 = painterResource(id = R.drawable.sunset)
            val painter2 = painterResource(id = R.drawable.sunrise)
            val imageDescription1 = "Beauty of Sunset"
            val imageDescription2 = "Beauty of Sunrise"
            val title1 = "Beauty of Sunset"
            val title2 = "Beauty of Sunrise"
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Yellow, Color.Green, Color.Magenta, Color.Blue
                            ),
                            startY = 20f
                        ),
                        alpha = 0.5f
                    )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                        .verticalScroll(state = rememberScrollState()),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    ImageCard(
                        painter1,
                        imageDescription1,
                        title1,
                        cornerRadius = 10.dp,
                        elevation = 15.dp,
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    ImageCard(
                        painter2,
                        imageDescription2,
                        title2,
                        cornerRadius = 10.dp,
                        elevation = 15.dp,
                    )
                }
            }
        }
    }
}