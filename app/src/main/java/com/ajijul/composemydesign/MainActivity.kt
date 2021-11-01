package com.ajijul.composemydesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            val textFieldState = remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            Scaffold(
                modifier = Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "SnackBar",fontStyle = FontStyle.Italic, fontSize = 20.sp, color = Color.Black)
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        value = textFieldState.value,
                        onValueChange = { it: String ->
                            textFieldState.value = it
                        },
                        label = {
                            Text(text = "Enter your name")
                        },
                        modifier = Modifier.fillMaxWidth(),
                        singleLine = true,
                        textStyle = TextStyle(Color.Black),
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(onClick = {
                        scope.launch { scaffoldState.snackbarHostState.showSnackbar("Hello ${textFieldState.value}") }
                    }) {
                        Text(text = "Please greet me")
                    }
                }
            }
        }
    }
}