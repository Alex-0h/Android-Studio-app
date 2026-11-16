package com.example.controlgastos.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// Paleta de respaldo (Android < 12). Color semilla: #006C4C
val LightColors = lightColorScheme(
    primary = Color(0xFF006C4C),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF89F8C7),
    onPrimaryContainer = Color(0xFF002114),
    secondary = Color(0xFF4D6357),
    background = Color(0xFFFBFDF9),
    surface = Color(0xFFFBFDF9),
    error = Color(0xFFBA1A1A)
)

val DarkColors = darkColorScheme(
    primary = Color(0xFF6CDBAC),
    onPrimary = Color(0xFF003826),
    primaryContainer = Color(0xFF005138),
    onPrimaryContainer = Color(0xFF89F8C7),
    secondary = Color(0xFFB3CCBE),
    background = Color(0xFF191C1A),
    surface = Color(0xFF191C1A),
    error = Color(0xFFFFB4AB)
)
