package com.carisca.tugasfrontend.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Album: Screen("album")
    data object About: Screen("about")
    data object Detail: Screen("detail_artis")
    data object DetailAlbum: Screen("deatil_album")
}