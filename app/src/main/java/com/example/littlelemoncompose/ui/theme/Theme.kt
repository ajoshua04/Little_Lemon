package com.example.littlelemoncompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import com.example.littlelemoncompose.LittleLemonColor


private val LightColorPalette = lightColors(
    primaryVariant = Purple700,
    primary = LittleLemonColor.yellow,
    secondary = LittleLemonColor.pink
)

@Composable
fun LittleLemonComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}