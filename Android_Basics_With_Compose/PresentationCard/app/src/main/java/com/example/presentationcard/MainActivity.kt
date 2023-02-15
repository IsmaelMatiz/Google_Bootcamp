package com.example.presentationcard

import android.graphics.Bitmap
import android.graphics.Picture
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.presentationcard.ui.theme.PresentationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentationCardTheme {
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
          modifier = Modifier.fillMaxWidth().fillMaxHeight(0.8f),
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
fun NameAndProfession(){

}

@Composable
fun SocialField(){

}

@Composable
fun ButtonSeeMore() {

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

            }
        }
    }
}