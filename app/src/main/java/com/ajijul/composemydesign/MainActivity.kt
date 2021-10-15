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
            /*For Column : Main axis is the vertical axis because if we add any item
            * it will stack vertically AND cross axis is horizontal axis
            * For Row : Main axis is the horizontal axis because if we add any item
            * it will stack horizontally AND cross axis is vertical axis*/
            Column(modifier = Modifier.background(Color.Blue)) {
                Column(
                    modifier = Modifier
                        .background(Color.Green)
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text("Hello")
                    Text("Column")
                }

                Row(
                    modifier = Modifier
                        .background(Color.Red)
                        .fillMaxWidth()
                        .height(100.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Hello")
                    Text("Row")
                }
            }
        }
    }
}