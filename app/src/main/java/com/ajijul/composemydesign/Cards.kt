package com.ajijul.composemydesign

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImageCard(
    painter: Painter,
    imageContentDescription: String,
    textTitle: String,
    modifier: Modifier = Modifier,
    cornerRadius: Dp,
    elevation: Dp
) {

    Card(
        modifier = modifier
            .height(300.dp)
            .width(230.dp),
        shape = RoundedCornerShape(cornerRadius),
        elevation = elevation
    ) {
        Image(
            painter = painter,
            contentDescription = imageContentDescription,
            contentScale = ContentScale.Crop,
        )
        Box(
            contentAlignment = Alignment.BottomStart,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent, Color.Black
                            ),
                            startY = 300f
                        )
                    )
            )
            Text(
                text = textTitle,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 17.sp,
                    fontStyle = FontStyle.Italic,
                    fontFamily = FontFamily.Monospace
                ),
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}