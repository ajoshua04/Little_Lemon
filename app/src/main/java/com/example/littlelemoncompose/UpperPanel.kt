package com.example.littlelemoncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.littlelemoncompose.ui.theme.LittleLemonComposeTheme

@Composable
fun UpperPanel(navController: NavController) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .background(LittleLemonColor.green)
            .padding(start = 12.dp, end = 12.dp, top = 16.dp, bottom = 16.dp)
    ) {
        Text(
            text = stringResource(id = R.string.little_Lemon),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = LittleLemonColor.yellow
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 24.sp,
            color = LittleLemonColor.cloud
        )
        Row(
            modifier = Modifier
                .padding(top = 18.dp)
        ) {
            Text(
                text = stringResource(id = R.string.descriptionone),
                color = LittleLemonColor.cloud,
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 28.dp)
                    .fillMaxWidth(0.6f)
            )
            Image(
                painter = painterResource(id = R.drawable.upperpanelimage),
                contentDescription = "Upper Panel Image",
                modifier = Modifier.clip(RoundedCornerShape(20.dp))
            )
        }
        Button(
            onClick = {navController.navigate(Menu.route)},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = LittleLemonColor.yellow)
        ) {
            Text(
                text = stringResource(id = R.string.order),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }
    }
}

