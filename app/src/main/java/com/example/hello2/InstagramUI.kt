package com.example.hello2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hello2.ui.theme.Hello2Theme

class InstagramUI : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Hello2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Instagram_UI()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Instagram_UI() {
    val image = painterResource(id = R.drawable.logo_instagram)
    val facebooklogo = painterResource(id = R.drawable.facebook_icon_white_png)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .padding(start = 20.dp, end = 20.dp, top = 10.dp, bottom = 10.dp)
    ) {
        Image(
            painter = image, contentDescription = "Instagram Logo",
            modifier = Modifier
                .width(250.dp)
                .height(100.dp),
            contentScale = ContentScale.FillWidth
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Sign up to see photos and videos",
                Modifier.alpha(0.5F),
                fontWeight = FontWeight(800)
            )
            Text(
                text = "from your friends.",
                Modifier.alpha(0.5F),
                fontWeight = FontWeight(800)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xff0095f6)),
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 10.dp, bottom = 10.dp)
                .fillMaxWidth()
                .width(250.dp)

        ) {
            Image(
                painter = facebooklogo,
                contentDescription = "Localized description",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Log in with Facebook", fontWeight = FontWeight(800))
        }
        Row {
            Divider(
                color = Color.DarkGray,
                modifier = Modifier
                    .padding(start = 40.dp, end = 10.dp, top = 10.dp, bottom = 10.dp)
                    .weight(2f)
                    .alpha(0.5F)
            )
            Text(text = "OR", fontWeight = FontWeight(800), modifier = Modifier.alpha(0.5F))
            Divider(
                color = Color.DarkGray,
                modifier = Modifier
                    .padding(start = 10.dp, end = 40.dp, top = 10.dp, bottom = 10.dp)
                    .weight(2f)
                    .alpha(0.5F)
            )
        }

        Column(
            modifier = Modifier
//                .padding(5.dp)
        ) {
            var socials by remember {
                mutableStateOf("")
            }
            var fullName by remember {
                mutableStateOf("")
            }
            var userName by remember {
                mutableStateOf("")
            }
            var password by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                value = socials,
                onValueChange = { socials = it },
                label = { Text(text = "Mobile Number or Email") },
                modifier = Modifier.padding(start = 5.dp, end = 5.dp, top = 10.dp, bottom = 5.dp)
            )
            OutlinedTextField(
                value = fullName,
                onValueChange = { fullName = it },
                label = { Text(text = "Full Name") },
                modifier = Modifier.padding(5.dp)

            )
            OutlinedTextField(
                value = userName,
                onValueChange = { userName = it },
                label = { Text(text = "Userame") },
                modifier = Modifier.padding(5.dp)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                modifier = Modifier.padding(5.dp),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "People who use our service may have uploaded" +
                        " your contact information to Instagram. Learn More",
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                modifier = Modifier.padding(start = 30.dp, end = 30.dp, top = 5.dp, bottom = 5.dp)
            )
            Text(
                text = "By signing up, you agree to our Terms" +
                        " , Privacy Policy and Cookies Policy .",
                textAlign = TextAlign.Center,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                modifier = Modifier.padding(start = 30.dp, end = 30.dp, top = 10.dp, bottom = 5.dp)
            )
        }
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xff0095f6)),
            contentPadding = ButtonDefaults.ButtonWithIconContentPadding,
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp, top = 10.dp, bottom = 10.dp)
                .fillMaxWidth()
                .width(250.dp),
        ) {
            Text("Sign Up", fontWeight = FontWeight(800))
        }


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Hello2Theme {
        Instagram_UI()
    }
}