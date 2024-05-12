package com.carisca.tugasfrontend.presentation


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import com.carisca.tugasfrontend.model.Artis

@Composable
fun DetailArtisScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    backclik: () -> Unit,
    artistsId: Int?
) {
    val newArtisList = DataDummy.AllArtis.filter { artis ->
        artis.id == artistsId
    }
    Column (
        modifier = modifier
    ) {
        DetailArtisContent(newArtistList = newArtisList, backclik = {navController.navigateUp()})
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailArtisContent(
    newArtistList: List<Artis>,
    modifier: Modifier = Modifier,
    backclik: () -> Unit
){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detail Artis",
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
                    .data(data = newArtistList[0].photo)
                    .build(),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 16.dp),
                contentDescription = "Poster Artis"
            )

            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = newArtistList[0].name,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(vertical = 10.dp)
            )
            Text(
                text = "Description",
                fontSize = 20.sp,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp, vertical = 10.dp)
            )
            Text(
                text = newArtistList[0].about,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier
                    .widthIn(max = 350.dp)
                    .align(Alignment.Start)
                    .padding(horizontal = 30.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailArtisContentPreview() {
    DetailArtisContent(newArtistList = DataDummy.AllArtis) {}
}
