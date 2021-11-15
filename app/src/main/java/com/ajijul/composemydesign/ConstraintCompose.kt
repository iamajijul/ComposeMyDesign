package com.ajijul.composemydesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun LoaderWithText(text: String) {
    ConstraintLayout(modifier = Modifier.fillMaxSize().background(Color.Cyan)) {
        val (progressBar1, text1) = createRefs()
        val topGuideline = createGuidelineFromTop(0.2f)
        val bottomGuideline = createGuidelineFromBottom(0.2f)
        CircularProgressIndicator(modifier = Modifier.constrainAs(progressBar1){
            top.linkTo(topGuideline)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        },
        color = MaterialTheme.colors.primary
        )
        Text(text = text,modifier = Modifier.constrainAs(text1){
            bottom.linkTo(bottomGuideline)
            start.linkTo(progressBar1.start)
            end.linkTo(progressBar1.end)
        },style = TextStyle(fontSize = 20.sp,fontStyle = FontStyle.Italic))
    }
}