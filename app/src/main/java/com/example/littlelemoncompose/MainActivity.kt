package com.example.littlelemoncompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.littlelemoncompose.ui.theme.LittleLemonComposeTheme
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update

class MainActivity : ComponentActivity() {
    private val productsState: MutableStateFlow<Products> =
        MutableStateFlow(Products(ProductsWarehouse.productsList))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LittleLemonComposeTheme() {
                AppScreen()
            }

        }
    }

    @Composable
    fun AppScreen(){
        val products by productsState.collectAsState()
        val scaffoldState = rememberScaffoldState()
        val scope = rememberCoroutineScope()
        val navController = rememberNavController()
        Scaffold(
            scaffoldState = scaffoldState,
            drawerContent = { DrawerPanel(scaffoldState = scaffoldState, scope = scope)},
            topBar = {
                TopAppBar(scaffoldState = scaffoldState, scope = scope)
            },
            bottomBar = { MyBottomNavigation(navController = navController)}
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            ) {
                NavHost(
                    navController = navController,
                    startDestination = Home.route
                ) {
                    composable(Home.route) {
                        HomeScreen(navController = navController, products = products, onOptionsItemSelected = ::onOptionsItemSelected)
                    }
                    composable(Menu.route) {
                        MenuListScreen(navController = navController, products = products,onOptionsItemSelected = ::onOptionsItemSelected)
                    }
                    composable(Location.route) {
                        LocationScreen()
                    }
                    composable(
                        DishDetails.route + "/{${DishDetails.argDishId}}",
                        arguments = listOf(navArgument(DishDetails.argDishId) { type = NavType.IntType })
                    ) {
                        val id = requireNotNull(it.arguments?.getInt(DishDetails.argDishId)) { "Dish id is null" }
                        ProductDetails(id)
                    }
                }
            }
        }
    }

    private fun onOptionsItemSelected(itemType: String) : Boolean{

        val type = when (itemType) {
            "All"-> FilterType.All
            "Drinks" -> FilterType.Drinks
            "Food" -> FilterType.Food
            "Dessert" -> FilterType.Dessert
            else -> FilterType.All
        }

        productsState.update {
            Products(
                filterProducts(
                    type,
                    ProductsWarehouse.productsList
                )
            )
        }

        return true
    }

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {

        return when (type) {
            FilterType.All -> productsList
            FilterType.Dessert -> productsList.filter { product -> product.category == "Dessert" }
            FilterType.Drinks -> productsList.filter { product -> product.category == "Drinks" }
            FilterType.Food -> productsList.filter { product -> product.category == "Food"  }
        }
    }


    @Composable
    fun MyBottomNavigation(navController: NavController) {
        val destinationList = listOf<Destinations>(
            Menu,
            Home,
            Location
        )
        val selectedIndex = rememberSaveable {
            mutableStateOf(0)
        }
        BottomNavigation() {
            destinationList.forEachIndexed{index, destination ->
                BottomNavigationItem(
                    label = { Text(text = destination.tittle) },
                    icon = { Icon(
                        painter = painterResource(id = destination.icon),
                        contentDescription = destination.tittle
                    )},
                    selected = index == selectedIndex.value,
                    onClick = {
                        selectedIndex.value = index
                        navController.navigate(destinationList[index].route){
                            popUpTo(Home.route)
                            launchSingleTop = true
                        }
                    })
            }
        }
    }


}







