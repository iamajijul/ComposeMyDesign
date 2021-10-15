package com.ajijul.composemydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight(0.5f)
                    .width(600.dp)// If views goes out of the screen, it will fixed on max width of parent view
                    // .requiredWidth(600.dp) // it will fix the width of the view, if width goes out of screen then it will take that width
                    .border(5.dp, Color.Black)
                    .padding(5.dp)
                    .border(5.dp, Color.Red)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(top = 20.dp, start = 20.dp)
            ) {
                Text(
                    "Hello", modifier = Modifier
                        .offset(0.dp, 20.dp)
                        .padding(5.dp)
                        .border(5.dp, Color.Red)
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text("Column")
            }

        }
    }
}