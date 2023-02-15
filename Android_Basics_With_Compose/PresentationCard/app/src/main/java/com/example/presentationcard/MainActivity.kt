package com.example.presentationcard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentationcard.ui.theme.PresentationCardTheme
import com.example.presentationcard.ui.theme.PurpleSmile
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
                val systemUiController = rememberSystemUiController()
                SideEffect {
                    systemUiController.setStatusBarColor(
                        color = Color.Blue,
                        darkIcons = false
                    )
                }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        Row(modifier = Modifier.weight(1f)) {
                            Box() {
                                TopImage(picture = painterResource(id = R.drawable.top_profile_pic))
                                Row(
                                    verticalAlignment = Alignment.Bottom,
                                    horizontalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ){

                                    ProfilePic(picture = painterResource(id = R.drawable.profile_picture2))
                                }
                            }
                        }
                        Row(modifier = Modifier.weight(1f)) {
                            Column {
                                NameAndProfession(name = "Ismael Matiz", profession = "Android Developer. ")
                                Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                                    SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.phone_number))
                                    SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.email))
                                    SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.github_profile))
                                }
                                ButtonSeeMore()
                            }
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun TopImage(picture: Painter){
    Image(painter = picture,
          contentDescription = "Top profile picture",
          modifier = Modifier
              .fillMaxWidth()
              .fillMaxHeight(0.8f),
          contentScale = ContentScale.Crop
        )
}

@Composable
fun ProfilePic(picture: Painter){
    Image(painter = picture,
        contentDescription = "Top profile picture",
        modifier = Modifier.fillMaxSize(0.4f)
    )
}

@Composable
fun NameAndProfession(name: String, profession: String){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = name,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = PurpleSmile,
                fontSize = 36.sp
                )
            Text(
                text = profession,
                fontWeight = FontWeight.Bold,
                fontFamily = PurpleSmile,
                color = Color.Gray
            )
        }
}

@Composable
fun SocialField(symbol: Painter, contactInfo: String){
    Row(modifier = Modifier.padding(8.dp)) {
        Row(modifier = Modifier
            .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(30))
            .fillMaxWidth()
            .padding(6.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = contactInfo)
        }
    }
}

@Composable
fun ButtonSeeMore() {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Button(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                colorResource(id = R.color.dark_blue)
            )
        ) {
            Text(text = "See More",
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PresentationCardTheme {
        Column() {
            Row(modifier = Modifier.weight(1f)) {
                Box() {
                        TopImage(picture = painterResource(id = R.drawable.top_profile_pic))
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){

                        ProfilePic(picture = painterResource(id = R.drawable.profile_picture2))
                    }
                }
            }
            Row(modifier = Modifier.weight(1f)) {
                Column {
                    NameAndProfession(name = "Ismael Matiz", profession = "Android Developer. ")
                    Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                        SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.phone_number))
                        SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.email))
                        SocialField(symbol = painterResource(id = R.drawable.ic_launcher_foreground), contactInfo = stringResource(id = R.string.github_profile))
                    }
                    ButtonSeeMore()
                }
            }
        }
    }
}