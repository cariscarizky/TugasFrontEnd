package com.carisca.tugasfrontend.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.carisca.tugasfrontend.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AboutProfileScreen(){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "About",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        }
    ) {contentPadding ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(android.graphics.Color.parseColor("#FFFFFF")))
                .padding(contentPadding)
        ) {
            Box(modifier = Modifier.heightIn(max = 300.dp)) {
                Image(
                    alignment = Alignment.TopCenter,
                    painter = painterResource(id = R.drawable.ellipse),
                    contentDescription = "Ellipse",
                    modifier = Modifier.fillMaxSize()

                )
                Image(
                    painter = painterResource(id = R.drawable.myprofile),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(180.dp)
                        .align(Alignment.BottomCenter)
                        .offset(y = 20.dp)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Box(
                modifier = Modifier
                    .background(
                        color = Color(android.graphics.Color.parseColor("#8AB7E1")),
                        shape = RoundedCornerShape(25.dp)
                    )
                    .width(350.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Carisca Rizky Sanyoko",
                    style = TextStyle(fontSize = 24.sp, color = Color.Black),
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .background(
                        color = Color(android.graphics.Color.parseColor("#8AB7E1")),
                        shape = RoundedCornerShape(25.dp)
                    )
                    .width(350.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "cariscarizky@gmail.com",
                    style = TextStyle(fontSize = 24.sp, color = Color.Black),
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .background(
                        color = Color(android.graphics.Color.parseColor("#8AB7E1")),
                        shape = RoundedCornerShape(25.dp)
                    )
                    .width(350.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "UPN Veteran Jawa Timur ",
                    style = TextStyle(fontSize = 24.sp, color = Color.Black),
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .background(
                        color = Color(android.graphics.Color.parseColor("#8AB7E1")),
                        shape = RoundedCornerShape(25.dp)
                    )
                    .width(350.dp)
                    .height(50.dp)
            ) {
                Text(
                    text = "Sistem Informasi",
                    style = TextStyle(fontSize = 24.sp, color = Color.Black),
                    modifier = Modifier
                        .align(Alignment.Center)
                )
            }
        }
    }
}


