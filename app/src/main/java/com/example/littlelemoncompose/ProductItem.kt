package com.example.littlelemoncompose

import androidx.annotation.DrawableRes

data class ProductItem(
    val id: Int,
    val name: String,
    val price: Double,
    val category: String,
    @DrawableRes val imageResource: Int,
    val description: String,
)

data class Products(val items: List<ProductItem>)