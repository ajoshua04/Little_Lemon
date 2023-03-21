package com.example.littlelemoncompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


@Composable
fun LowerPanel(navController: NavHostController,products: Products, onOptionsItemSelected: (category: String)-> Unit) {

    Column {

        LazyRow(horizontalArrangement = Arrangement.Center, modifier = Modifier.align(Alignment.CenterHorizontally)) {
            items(Categories) { category ->
                Button(
                    onClick = { onOptionsItemSelected(category) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    shape = RoundedCornerShape(40),
                    modifier = Modifier.padding(5.dp)
                ) {
                    Text(
                        text = category
                    )
                }
            }
        }
        Divider(
            modifier = Modifier.padding(8.dp),
            color = LittleLemonColor.yellow,
            thickness = 1.dp
        )
        ProductsColumn(products = products,navController)


    }


}


val Categories = listOf(
    "All",
    "Food",
    "Drinks",
    "Dessert"
)


