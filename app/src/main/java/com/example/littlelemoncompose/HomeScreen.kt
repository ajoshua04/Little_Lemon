package com.example.littlelemoncompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavController,products: Products, onOptionsItemSelected: (category: String)-> Unit){
    Column {
        UpperPanel(navController)
        Divider(
            modifier = Modifier.padding(8.dp),
            color = LittleLemonColor.yellow,
            thickness = 1.dp
        )
        LowerPanel(navController as NavHostController,products,onOptionsItemSelected)
    }
}