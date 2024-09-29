package com.jdw.skillstestapp.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Map
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

object Constants {
    val items = listOf(
        BottomNaviBarScreen.GoogleMaps,
        BottomNaviBarScreen.GeminiCharRoom,
        BottomNaviBarScreen.ThirdTap,
    )

}

enum class BottomNaviBarScreen(val label: String, val icon: ImageVector, val route: String) {
    GoogleMaps("Google Maps", Icons.Filled.Map, "googlemaps"),
    GeminiCharRoom("Chat with Gemini", Icons.Filled.Menu, "geminiCharRoom"),
    ThirdTap("Third Tap", Icons.Filled.Menu, "thirdtap"),
}