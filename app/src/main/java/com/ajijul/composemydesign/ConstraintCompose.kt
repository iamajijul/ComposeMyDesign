package com.ajijul.composemydesign

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun LoaderWithText(text: String) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (progressBar1, text1) = createRefs()
        CircularProgressIndicator(modifier = Modifier.constrainAs(progressBar1){
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        },
        color = MaterialTheme.colors.primary
        )
        Text(text = text,modifier = Modifier.constrainAs(text1){
            top.linkTo(progressBar1.bottom)
            start.linkTo(progressBar1.start)
            end.linkTo(progressBar1.end)
        })
    }
}