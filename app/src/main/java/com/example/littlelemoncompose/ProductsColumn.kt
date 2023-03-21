package com.example.littlelemoncompose


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ProductsColumn(products: Products, navController: NavHostController? = null) {
    LazyColumn {
        items(
            items = products.items,
            itemContent = {productItem: ProductItem ->
                MenuDish(navController, productItem)
            }
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MenuDish(navController: NavHostController? = null, Dish: ProductItem) {
    Card(onClick = {
        Log.d("AAA", "Click ${Dish.id}")
        navController?.navigate(DishDetails.route + "/${Dish.id}")
    }) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Text(
                    text = Dish.name, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = LittleLemonColor.charcoal
                )
                Text(
                    text = Dish.description,
                    color = LittleLemonColor.green,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = Dish.price.toString(), color = LittleLemonColor.green, fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(id = Dish.imageResource),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize()
                    .align(alignment = Alignment.CenterVertically)
            )
        }
    }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = LittleLemonColor.yellow,
        thickness = 1.dp
    )
}