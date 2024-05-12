package com.carisca.tugasfrontend.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.carisca.tugasfrontend.data.DataDummy
import com.carisca.tugasfrontend.model.Artis
import com.carisca.tugasfrontend.model.Album
import com.carisca.tugasfrontend.navigation.Screen
import com.carisca.tugasfrontend.presentation.component.ArtisItem
import com.carisca.tugasfrontend.presentation.component.AlbumItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    albums: List<Album> = DataDummy.AllAlbum,
    artists: List<Artis> = DataDummy.AllArtis,
) {

    Scaffold(
        topBar = {
            TopAppBar(title = { Text(
                text = "Music App",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold) })
        }
    ){contentPadding ->
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(contentPadding)
        ) {
            item {
                Text(
                    text = "Baru Diputar",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(16.dp)
                )
                LazyRow(
                    contentPadding = PaddingValues(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = modifier
                ) {
                    items(albums, key = { it.id }) {
                        AlbumItem(album = it) {albumId ->
                            navController.navigate(Screen.DetailAlbum.route + "/$albumId")
                        }
                    }
                }
            }
            item {
                Text(
                    text = "Artis Favoritmu",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(16.dp)
                )
            }
            items(artists, key = { it.id }) {
                ArtisItem(artis = it) { artisId ->
                    navController.navigate(Screen.Detail.route + "/$artisId")
                }
            }
        }
    }
}
