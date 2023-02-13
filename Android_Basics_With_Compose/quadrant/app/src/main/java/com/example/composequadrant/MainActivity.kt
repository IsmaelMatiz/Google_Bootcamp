package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxHeight()) {
                        Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f)) {
                            Quadrant1()
                            Quadrant2()
                        }
                        Row(modifier = Modifier.fillMaxWidth()) {
                            Quadrant3()
                            Quadrant4()

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Quadrant1(){
    var title = stringResource(id = R.string.titleQuadrant1)
    var content = stringResource(id = R.string.contentQuadrant1)

    Surface(color = androidx.compose.ui.graphics.Color.Green) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth(0.5f).fillMaxHeight(),
                verticalArrangement = Arrangement.Center) {
            Text(text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = content)
        }
    }
}

@Composable
fun Quadrant2(){
    var title = stringResource(id = R.string.titleQuadrant2)
    var content = stringResource(id = R.string.contentQuadrant2)

    Surface(color = androidx.compose.ui.graphics.Color.Yellow) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center) {
            Text(text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = content)
        }
    }
}

@Composable
fun Quadrant3(){
    var title = stringResource(id = R.string.titleQuadrant3)
    var content = stringResource(id = R.string.contentQuadrant3)

    Surface(color = androidx.compose.ui.graphics.Color.Cyan) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth(0.5f).fillMaxHeight(),
            verticalArrangement = Arrangement.Center) {
            Text(text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = content)
        }
    }
}

@Composable
fun Quadrant4(){
    var title = stringResource(id = R.string.titleQuadrant4)
    var content = stringResource(id = R.string.contentQuadrant4)

    Surface(color = androidx.compose.ui.graphics.Color.LightGray) {
        Column(modifier = Modifier.padding(16.dp).fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center) {
            Text(text = title,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth(),
                textAlign = TextAlign.Center
            )
            Text(text = content)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        Column(modifier = Modifier.fillMaxHeight()) {
            Row(modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f)) {
                Quadrant1()
                Quadrant2()
            }
            Row(modifier = Modifier.fillMaxWidth()) {
                Quadrant3()
                Quadrant4()

            }
        }
    }
}