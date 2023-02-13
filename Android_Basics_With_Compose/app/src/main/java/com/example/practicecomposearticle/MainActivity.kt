package com.example.practicecomposearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposearticle.ui.theme.PracticeComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        PostImage()
                        PostTitle()
                        PostIntro()
                        PostContent()
                    }
                }
            }
        }
    }
}


@Composable
fun PostImage(){
    var image = painterResource(R.drawable.image_top)

    Image(painter = image,
          contentDescription = "Post Image",
          modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun PostTitle(){
    var title = stringResource(R.string.Article_Title)
    Text(text = title,
         fontSize = 24.sp,
         modifier = Modifier.padding(16.dp)
        )
}

@Composable
fun PostIntro(){
    var title = stringResource(R.string.What_is_jetpack)
    Text(text = title,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun PostContent(){
    var title = stringResource(R.string.goalTutorial)
    Text(text = title,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    PracticeComposeArticleTheme {
        Column {
            PostImage()
            PostTitle()
            PostIntro()
            PostContent()
        }
    }
}