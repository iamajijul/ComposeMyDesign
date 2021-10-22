package com.ajijul.composemydesign

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun AppText1(text: String, fontFamily: androidx.compose.ui.text.font.FontFamily, color: Color) {
    Text(
        text = buildAnnotatedString {
            if (text.isEmpty()) return
            val st = text.split(" ")
            st.forEach { item ->
                withStyle(
                    style = SpanStyle(
                        color = Color.Red,
                        fontSize = 50.sp
                    )
                ) {
                    append(item.substring(0, 1))
                }
                append(item.substring(1, item.length) +"    ")
            }
        },
        style = TextStyle(
            color = color,
            fontSize = 20.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center,
            /*textDecoration = TextDecoration.Underline*/
        ),
    )
}