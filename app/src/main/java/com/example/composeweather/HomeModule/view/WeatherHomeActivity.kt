package com.example.composeweather.HomeModule.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Text
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.preferredHeight
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composeweather.Constants.purple200

class WeatherHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                WeatherHomeScreen()
            }
        }
    }


    @Composable
    fun WeatherHomeScreen() {
        val scaffoldState = rememberScaffoldState()
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = { HomeScreenAppBar() },
            bodyContent = { WeatherContent() }
        )
    }

    @Composable
    fun WeatherContent() {
        Column() {
            //Image
            //Current weather info

            // Pronostic 7 days
        }
    }

    @Composable
     fun HomeScreenAppBar(){
        TopAppBar(title = {Text("TopAppBar")},backgroundColor = purple200)
    }


    @Preview("MyScreen preview")
    @Composable
    fun DefaultPreview() {
        WeatherHomeScreen()
    }
}