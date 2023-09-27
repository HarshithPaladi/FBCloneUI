package com.example.hello2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello2.ui.theme.Hello2Theme
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class BMICalculator : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BMICalculatorUI("Android")
                }
            }
        }
    }
}

fun BMI_Calculator(weight: Float, height: Float): Float {
    val bmi = (weight / (height * height))
    return String.format("%.2f", bmi).toFloat()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BMICalculatorUI(name: String, modifier: Modifier = Modifier) {
    var height by remember {
        mutableStateOf("")
    }
    var weight by remember {
        mutableStateOf("")
    }
    var BMI by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "BMI Calculator", fontWeight = FontWeight(900), fontSize = 36.sp)
        TextField(
            value = height,
            onValueChange = { height = it },
            label = { Text(text = "Height (in M)") })
        TextField(
            value = weight,
            onValueChange = { weight = it },
            label = { Text(text = "Weight (in Kg)") })
        TextField(
            value = BMI,
            onValueChange = { BMI = it },
            label = { Text(text = "Your BMI") })
        Button(
            onClick = { BMI = BMI_Calculator(weight.toFloat(), height.toFloat()).toString() },
            colors = ButtonDefaults.buttonColors(Color(0xFF358856)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .size(width = 200.dp, height = 60.dp)
                .padding(top = 10.dp)
        ) {
            Text(text = "Calculate BMI", color = Color.White)
        }


    }


}

@Preview(showBackground = true)
@Composable
fun BMICalculatorPreview2() {
    Hello2Theme {
        BMICalculatorUI("BMI")
    }
}