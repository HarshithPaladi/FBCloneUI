package com.example.hello2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello2.ui.theme.Hello2Theme

class SimpleCalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

fun sumit(a: Float, b: Float): Float {
    return a + b
}

fun subit(a: Float, b: Float): Float {
    return a - b
}

fun mulit(a: Float, b: Float): Float {
    return a * b
}

fun divit(a: Float, b: Float): Float {
    return a / b
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        var a by remember {
            mutableStateOf("")
        }
        var b by remember {
            mutableStateOf("")
        }
        var c by remember {
            mutableStateOf("")
        }
        Text(
            text = "Calculator",
            fontWeight = FontWeight(900),
            fontSize = 36.sp
        )
        TextField(value = a, onValueChange = { a = it }, placeholder = { Text(text = "Number 1") })
        TextField(value = b, onValueChange = { b = it }, placeholder = { Text(text = "Number 2") })
        TextField(value = c, onValueChange = {}, placeholder = { Text(text = "Result") })
        Row(modifier = Modifier.padding(4.dp)) {
            Button(onClick = { c = sumit(a.toFloat(), b.toFloat()).toString() }) {
                Text(text = "+")
            }
            Button(onClick = { c = subit(a.toFloat(), b.toFloat()).toString() }) {
                Text(text = "-")
            }
            Button(onClick = { c = mulit(a.toFloat(), b.toFloat()).toString() }) {
                Text(text = "*")
            }
            Button(onClick = {
                if (b.toFloat() != 0f) {
                    c = (divit(a.toFloat(), b.toFloat())).toString()
                } else {
                    c = "Cannot divide by zero"
                }
            }) {
                Text(text = "/")
            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Hello2Theme {
        Greeting("Android")
    }
}