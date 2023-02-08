package com.example.appgooglecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appgooglecourse.ui.theme.AppGoogleCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppGoogleCourseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.bg_template)
                ) {
                    BithdayGreetingText1("Happy Birthday","Abuelita","-From Ismael Matiz")
                }
            }
        }
    }
}

@Composable
fun BithdayGreetingText1(message: String,name: String,from: String) {
        Column(modifier = Modifier.padding(20.dp,10.dp)) {
            Text(
                text = message,
                fontSize = 48.sp,
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            )
            Text(text = name,
                fontSize = 70.sp,
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            )
            Text(text = from,
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            )
        }
}


@Composable
fun HappyBirthdayImageGreeting(){
    val image = painterResource(id = R.drawable.happy_birthday_piolin)
    Image(painter = image,
        contentDescription = "Image to complement the Card",
        modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally),
        contentScale = ContentScale.Crop
    )
}

@Preview(name = "Card Preview", showBackground = false, showSystemUi = true)
@Composable
fun BirthdayCardWithEverithingPreview() {
    AppGoogleCourseTheme {
        Surface(
            color = colorResource(id = R.color.bg_template),
            modifier = Modifier.fillMaxWidth().fillMaxHeight()
        ) {
            Column() {
                BithdayGreetingText1("Happy Birthday","Abuelita","-From Ismael Matiz")
                HappyBirthdayImageGreeting()
            }
        }

    }
}