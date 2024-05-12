package com.carisca.tugasfrontend.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carisca.tugasfrontend.R
import com.carisca.tugasfrontend.model.Artis
import com.carisca.tugasfrontend.ui.theme.TugasFrontEndTheme

@Composable
fun ArtisItem(
    artis: Artis,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .clickable { onItemClicked(artis.id) }
            .fillMaxWidth()
            .padding(start = 18.dp)
    ) {
        Image(
            painter = painterResource(id = artis.photo),
            contentDescription = artis.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(text = artis.name, style = MaterialTheme.typography.titleLarge)
            Text(text = "Artis", style = MaterialTheme.typography.labelLarge)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ArtisItemPreview() {
    TugasFrontEndTheme {
        ArtisItem(
            artis = Artis(1, "Boynextdoor", "Boynextdoor dari HYBE dan KOZ entertainment kembali dengan album kedua", R.drawable.boynextdoor),
            onItemClicked = { artisId ->
                println("Artis Id : $artisId")
            }
        )
    }
}