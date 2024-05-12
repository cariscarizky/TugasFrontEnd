package com.carisca.tugasfrontend.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.carisca.tugasfrontend.data.DataDummy
import com.carisca.tugasfrontend.model.Album
import com.carisca.tugasfrontend.presentation.component.AlbumItem
import com.carisca.tugasfrontend.navigation.Screen
import com.carisca.tugasfrontend.ui.theme.TugasFrontEndTheme

fun List<Album>.filterByName(searchText: String): List<Album>
{
    return if (searchText.isEmpty()) {
        this
    } else {
        this.filter {it.name.contains(searchText, ignoreCase = true)}
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlbumScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    albums: List<Album> = DataDummy.AllAlbum
) {

    var searchText by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    var items by remember { mutableStateOf<List<String>>(emptyList()) }

    val filteredList = albums.filterByName(searchText)

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = "Album",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            })
        },
    ) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            SearchBar(
                modifier = Modifier
                    .fillMaxWidth(),
                query = searchText,
                onQueryChange = {
                    searchText = it
                },
                onSearch = {
                    if (searchText.isNotBlank()) {
                        items = items + searchText
                    }
                    active = false
                },
                active = active,
                onActiveChange = {
                    active = it
                },
                placeholder = {
                    Text(text = "Search Album")
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Search Icon")
                },
                trailingIcon = {
                    if (active) {
                        Icon(
                            modifier = Modifier.clickable {
                                if (searchText.isNotEmpty()) {
                                    searchText = ""
                                } else {
                                    active = false
                                }
                            },
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close Icon"
                        )
                    }
                }
            ) {
                items.forEach { historyItem ->
                    Row(modifier = Modifier.padding(all = 14.dp)) {
                        Icon(
                            modifier = Modifier.padding(end = 10.dp),
                            imageVector = Icons.Default.History,
                            contentDescription = "History Icon"
                        )
                        Text(text = historyItem)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            LazyVerticalGrid(
                contentPadding = PaddingValues(6.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                columns = GridCells.Adaptive(150.dp),
                modifier = modifier
                    .fillMaxSize()
            ) {
                items(filteredList, key = { it.id }) {
                    AlbumItem(album = it) { albumId ->
                        navController.navigate(Screen.DetailAlbum.route + "/$albumId")
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AlbumScreenPreview() {
    TugasFrontEndTheme {
        AlbumScreen(albums = DataDummy.AllAlbum, navController = rememberNavController())
    }
}