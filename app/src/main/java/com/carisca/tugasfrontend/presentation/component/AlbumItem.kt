package com.carisca.tugasfrontend.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carisca.tugasfrontend.R
import com.carisca.tugasfrontend.model.Album
import com.carisca.tugasfrontend.ui.theme.TugasFrontEndTheme

@Composable
fun AlbumItem(
    album: Album,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable { onItemClicked(album.id) }
    ) {
        Image(
            painter = painterResource(id = album.photo),
            contentDescription = album.name, modifier = Modifier
                .size(100.dp)
        )
        Text(
            text = album.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
        Text(
            text = album.year.toString(),
            style = MaterialTheme.typography.bodySmall,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AlbumItemHorizontalPreview() {
    TugasFrontEndTheme{
        AlbumItem(
            album = Album(1, "HOW?", 2024, R.drawable.how, "OUR", "Amnesia"
                , "So lets go see the stars", "Earth, Wind & Fire", "lifeiscool", "Boynextdoor"),
            onItemClicked = { albumId ->
                println("Album Id : $albumId")
            }
        )
    }
}