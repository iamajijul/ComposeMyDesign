package com.ajijul.composemydesign

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun LoaderWithText(text: String) {
    BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
        val constraint =
            if (minWidth < 600.dp) myDecoupledConstraint(0.5f) else myDecoupledConstraint(0.5f)
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Cyan),
            constraintSet = constraint
        ) {
            CircularProgressIndicator(
                modifier = Modifier.layoutId("progressBarID"),
                color = MaterialTheme.colors.primary
            )
            Text(
                text = text,
                modifier = Modifier.layoutId("textID"),
                style = TextStyle(fontSize = 20.sp, fontStyle = FontStyle.Italic)
            )
        }
    }

}

private fun myDecoupledConstraint(verticalBias: Float): ConstraintSet {
    return ConstraintSet {
        val topGuideLine = createGuidelineFromTop(verticalBias)
        val progressBar = createRefFor("progressBarID")
        val text = createRefFor("textID")
        constrain(progressBar) {
            top.linkTo(topGuideLine)
            bottom.linkTo(topGuideLine)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(text) {
            top.linkTo(progressBar.bottom)
            start.linkTo(progressBar.start)
            end.linkTo(progressBar.end)
        }
    }
}