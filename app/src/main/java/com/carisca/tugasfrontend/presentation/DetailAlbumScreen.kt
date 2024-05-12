package com.carisca.tugasfrontend.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowCircleDown
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.ui.text.font.FontWeight
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.carisca.tugasfrontend.data.DataDummy
import com.carisca.tugasfrontend.model.Album

@Composable
fun DetailAlbumScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    backclik: () -> Unit,
    albumsId: Int?
) {
    val newAlbumList = DataDummy.AllAlbum.filter { album ->
        album.id == albumsId
    }
    Column (
        modifier = modifier
    ) {
        DetailAlbumContent(newAlbumsList = newAlbumList, backclik = {navController.navigateUp()})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailAlbumContent(
    newAlbumsList: List<Album>,
    modifier: Modifier = Modifier,
    backclik: () -> Unit
){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detail Album",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(vertical = 20.dp)
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {backclik()}) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back Icon")
                    }
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
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(data = newAlbumsList[0].photo)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 16.dp),
                contentDescription = "Poster Album"
            )

            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = newAlbumsList[0].name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(horizontal = 30.dp)
                    .align(Alignment.Start)
            )
            Text(
                text = newAlbumsList[0].artisname,
                fontSize = 25.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp, vertical = 10.dp)
            )

            Row(modifier = Modifier.align(Alignment.Start)) {
                Text(
                    text = "Album",
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                )
                Text(
                    text = newAlbumsList[0].year.toString(),
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .padding(horizontal = 30.dp)
                        .offset(x = -50.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.align(Alignment.Start)) {
                Icon(
                    imageVector = Icons.Default.AddCircleOutline,
                    contentDescription = "Add Icon",
                    modifier = Modifier
                        .offset(x= 30.dp)
                        .size(30.dp)
                )

                Icon(
                    imageVector = Icons.Default.ArrowCircleDown,
                    contentDescription = "Add Icon",
                    modifier = Modifier
                        .offset(x= 30.dp)
                        .size(30.dp)
                )

                Icon(
                    imageVector = Icons.Default.Shuffle,
                    contentDescription = "Shuffle Icon",
                    modifier = Modifier
                        .offset(x= 30.dp)
                        .size(30.dp)
                )

                Icon(
                    imageVector = Icons.Default.PlayCircle,
                    contentDescription = "Add Icon",
                    modifier = Modifier
                        .offset(x= 180.dp, y= -43.dp)
                        .size(80.dp)
                )
            }

            Text(
                text = "1." + newAlbumsList[0].song1,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )

            Text(
                text = "2." + newAlbumsList[0].song2,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )

            Text(
                text = "3." + newAlbumsList[0].song3,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )

            Text(
                text = "4." + newAlbumsList[0].song4,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )

            Text(
                text = "5." + newAlbumsList[0].song5,
                fontSize = 18.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailAlbumContentPreview() {
    DetailAlbumContent(newAlbumsList = DataDummy.AllAlbum) {}
}