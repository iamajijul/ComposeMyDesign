package com.ajijul.composemydesign

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun MyColorBox1(
    modifier: Modifier,
    ownColor: MutableState<Color>,
    otherColor: MutableState<Color>
) {
    Box(
        modifier = modifier
            .background(ownColor.value)
            .border(width = 10.dp, brush = CommonBrush(), shape = RectangleShape)
            .clickable {
                otherColor.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            },
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = ownColor.value.toArgb().toString(),
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Monospace
            )
        )
    }
}

@Composable
fun MyColorBox2(
    modifier: Modifier,
    ownColor: MutableState<Color>,
    otherColor: MutableState<Color>
) {
    Box(
        modifier = modifier
            .background(ownColor.value)
            .border(width = 10.dp, brush = CommonBrush(), shape = RectangleShape)
            .clickable {
                otherColor.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = ownColor.value.toArgb().toString(),
            style = TextStyle(
                fontSize = 20.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.Monospace
            )
        )
    }
}

@Composable
fun CommonBrush(): Brush {
    return Brush.verticalGradient(
        listOf(
            Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            ), Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            ), Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            ), Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        )
    )
}