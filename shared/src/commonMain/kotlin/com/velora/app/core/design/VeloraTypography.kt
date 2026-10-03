package com.velora.app.core.design

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val VeloraTypography = Typography(

    displayLarge = TextStyle(
        fontSize = 56.sp,
        lineHeight = 62.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = (-1).sp
    ),

    displayMedium = TextStyle(
        fontSize = 44.sp,
        lineHeight = 50.sp,
        fontWeight = FontWeight.Light
    ),

    headlineLarge = TextStyle(
        fontSize = 34.sp,
        lineHeight = 41.sp,
        fontWeight = FontWeight.Medium
    ),

    headlineMedium = TextStyle(
        fontSize = 28.sp,
        lineHeight = 35.sp,
        fontWeight = FontWeight.Medium
    ),

    titleLarge = TextStyle(
        fontSize = 22.sp,
        lineHeight = 28.sp,
        fontWeight = FontWeight.Medium
    ),

    titleMedium = TextStyle(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Medium
    ),

    bodyLarge = TextStyle(
        fontSize = 17.sp,
        lineHeight = 27.sp,
        fontWeight = FontWeight.Normal
    ),

    bodyMedium = TextStyle(
        fontSize = 15.sp,
        lineHeight = 23.sp,
        fontWeight = FontWeight.Normal
    ),

    labelLarge = TextStyle(
        fontSize = 15.sp,
        lineHeight = 20.sp,
        fontWeight = FontWeight.SemiBold
    ),

    labelMedium = TextStyle(
        fontSize = 13.sp,
        lineHeight = 18.sp,
        fontWeight = FontWeight.Medium
    )
)