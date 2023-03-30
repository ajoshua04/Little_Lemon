package com.example.littlelemoncompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopAppBar(scaffoldState : ScaffoldState? = null, scope: CoroutineScope? = null){
    Row(horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier.fillMaxWidth(),
    verticalAlignment = Alignment.CenterVertically){
        IconButton(onClick = { scope?.launch {scaffoldState?.drawerState?.open()}}) {
            Image(painter = painterResource(id = R.drawable.hamburguermenu), contentDescription ="Menu Icon" , modifier = Modifier.size(45.dp))
        }
        Image(
            painter = painterResource(id = R.drawable.littlelemontopbar),
            contentDescription = "LittleLemon Logo",
            modifier =  Modifier.fillMaxWidth(0.5F))
        IconButton(onClick = { /*TODO*/ }) {
            Image(painter = painterResource(id = R.drawable.basket), contentDescription ="Cart" , modifier = Modifier.size(45.dp))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
    TopAppBar()
}