package com.velora.app.core.design

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val VeloraLightColorScheme = lightColorScheme(
    primary = VeloraColors.DeepSage,
    onPrimary = VeloraColors.WarmWhite,

    primaryContainer = VeloraColors.SoftSage,
    onPrimaryContainer = VeloraColors.Ink,

    secondary = VeloraColors.Moss,
    onSecondary = VeloraColors.WarmWhite,

    secondaryContainer = VeloraColors.SoftRose,
    onSecondaryContainer = VeloraColors.Ink,

    tertiary = VeloraColors.Lavender,
    onTertiary = VeloraColors.Ink,

    background = VeloraColors.Background,
    onBackground = VeloraColors.Ink,

    surface = VeloraColors.Surface,
    onSurface = VeloraColors.Ink,

    surfaceVariant = VeloraColors.Card,
    onSurfaceVariant = VeloraColors.TextSecondary,

    outline = VeloraColors.Taupe,

    error = VeloraColors.Error
)

@Composable
fun VeloraTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = VeloraLightColorScheme,
        typography = VeloraTypography,
        content = content
    )
}