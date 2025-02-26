package com.example.littlelemoncompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductDetails(id: Int) {
    val dish = requireNotNull(ProductsWarehouse.getProduct(id))
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Image(
            painter = painterResource(id = dish.imageResource),
            contentDescription = "Dish image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column (
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ){
            Text(text = dish.name, style = MaterialTheme.typography.h1, fontSize = 25.sp, fontWeight = FontWeight.Bold)
            Text(text = dish.description, style = MaterialTheme.typography.body1)
            Counter()
            Button(onClick = { /*TODO*/ },modifier = Modifier.fillMaxWidth()) {
                Text(text = stringResource(id = R.string.add_for) + " $${dish.price}", textAlign = TextAlign.Center)
            }
        }
    }
}

@Composable
fun Counter() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth(),
    ) {
        var counter by remember {
            mutableStateOf(1)
        }
        TextButton(
            onClick = {
                counter--
            }
        ) {
            Text(
                text = "-",
                style = MaterialTheme.typography.h2
            )
        }
        Text(
            text = counter.toString(),
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(16.dp)
        )
        TextButton(
            onClick = {
                counter++
            }
        ) {
            Text(
                text = "+",
                style = MaterialTheme.typography.h2
            )
        }
    }
}

@Preview
@Composable
fun DishDetailsPreview() {
    ProductDetails(id = 1)
}
