package com.example.hello2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello2.ui.theme.Hello2Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    AppUI()
                    AppFbUI()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppFbUI() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        val image = painterResource(id = R.drawable.presidio_blue_logo)
        var firstName by remember {
            mutableStateOf("")
        }
        var lastName by remember {
            mutableStateOf("")
        }
        var socials by remember {
            mutableStateOf("")
        }
        var password by remember {
            mutableStateOf("")
        }
        var date by remember {
            mutableStateOf("")
        }
        var month by remember {
            mutableStateOf("")
        }
        var year by remember {
            mutableStateOf("")
        }
        Text(
            text = "Sign Up",
            fontSize = 32.sp,
            fontWeight = FontWeight(900),
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
        Text(
            text = "It's quick and easy",
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 4.dp, end = 4.dp)
        )
        Divider(modifier = Modifier.padding(top = 4.dp, bottom = 4.dp))
//        Image(
//            painter = image,
//            contentDescription = "android party",
//            contentScale = ContentScale.Fit,
//        )

        Row {

            TextField(
                value = firstName,
                onValueChange = { firstName = it },
                placeholder = { Text(text = "First Name") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )
            TextField(
                value = lastName,
                onValueChange = { lastName = it },
                placeholder = { Text(text = "Surname") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )

        }
        Row {
            TextField(
                value = socials,
                onValueChange = { socials = it },
                placeholder = { Text(text = "Mobile number or email address") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )
        }
        Row {
            TextField(
                value = password,
                onValueChange = { password = it },
                placeholder = { Text(text = "New Password") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )
        }

        Text(
            text = "Date of Birth", modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        )
        Row {

            TextField(
                value = date,
                onValueChange = { date = it },
                placeholder = { Text(text = "06") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )
            TextField(
                value = month,
                onValueChange = { month = it },
                placeholder = { Text(text = "August") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )
            TextField(
                value = year,
                onValueChange = { year = it },
                placeholder = { Text(text = "2002") },
                modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            )

        }
        Text(
            text = "People who use our service may have uploaded your contact information to Facebook. Learn more.\n" + "\n" +
                    "By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy. You may receive SMS notifications from us and can opt out at any time.",
            modifier = Modifier.padding(4.dp), fontSize = 8.sp, lineHeight = 12.sp
        )
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xFF358856)),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .size(width = 200.dp, height = 60.dp)
                    .padding(top = 10.dp)
            ) {
                Text(text = "Sign Up", color = Color.White)
            }


        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppUI() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        val image = painterResource(id = R.drawable.presidio_blue_logo)
        var a by remember {
            mutableStateOf("")
        }

        var b by remember {
            mutableStateOf("")
        }
        Text(
            text = "Welcome!",
            fontSize = 32.sp,
            color = Color.Blue
        )
        Image(
            painter = image,
            contentDescription = "android party",
            contentScale = ContentScale.Fit,
        )
        Text(
            text = "Username",
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )
        TextField(value = a, onValueChange = { a = it }, Modifier.fillMaxWidth(), placeholder = {
            Text(
                text = "Username"
            )
        })
        Text(
            text = "Password",
            textAlign = TextAlign.Start,
            modifier = Modifier.fillMaxWidth()
        )

        TextField(value = b, onValueChange = { b = it }, Modifier.fillMaxWidth(), placeholder = {
            Text(text = "Password")
        })
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(text = "Sign In")
            }
            Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = "Sign Up", color = Color.Blue)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
//    AppUI()
    AppFbUI()
}
