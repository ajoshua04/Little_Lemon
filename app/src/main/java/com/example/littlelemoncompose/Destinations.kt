package com.example.littlelemoncompose

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route: String
    val icon: Int
    val tittle: String
}

object Home : Destinations {
    override val route = "Home"
    override val icon = R.drawable.ic_home
    override val tittle = "Home"
}

object Menu : Destinations {
    override val route = "Menu"
    override val icon = R.drawable.ic_menu
    override val tittle = "Menu"
}

object Location : Destinations {
    override val route = "Location"
    override val icon = R.drawable.ic_location
    override val tittle = "Location"
}

object DishDetails : Destinations {
    override val route = "DishDetails"
    const val argDishId = "dishId"
    override val icon = R.drawable.ic_menu
    override val tittle = "DishDetails "
}