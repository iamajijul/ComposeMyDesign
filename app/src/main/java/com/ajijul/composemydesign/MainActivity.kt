package com.ajijul.composemydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn( modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)) {
                itemsIndexed((1..5000).toList()){ index, value ->
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                            .background(
                                color = Color(
                                    Random.nextFloat(),
                                    Random.nextFloat(),
                                    Random.nextFloat(),
                                    1f
                                )
                            ),
                        text = "Value $value    Index $index",
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}