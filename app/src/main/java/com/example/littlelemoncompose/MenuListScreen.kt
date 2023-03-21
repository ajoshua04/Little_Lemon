package com.example.littlelemoncompose


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun MenuListScreen(navController: NavController,products: Products, onOptionsItemSelected: (category: String)-> Unit) {

    Column {
        UpperPanelMenu()
        LowerPanel(navController as NavHostController,products,onOptionsItemSelected)
    }

}

@Composable
fun UpperPanelMenu() {
    Column(
        modifier = Modifier
            .background(Color(0xFF495E57))
            .fillMaxWidth()
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 40.sp,
            fontWeight = Bold,
            color = Color(0xFFF4CE14)
        )

    }
    Text(
        text = "ORDER FOR TAKEAWAY",
        fontSize = 24.sp,
        fontWeight = Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )
}

