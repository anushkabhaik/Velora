package com.velora.app

import androidx.compose.runtime.Composable
import com.velora.app.core.design.VeloraTheme
import com.velora.app.features.onboarding.WelcomeScreen

@Composable
fun App() {
    VeloraTheme {
        WelcomeScreen(
            onGetStarted = {
                // Onboarding navigation will be connected in Checkpoint 2C.
            },
            onLogin = {
                // Authentication will be connected in Milestone 3.
            }
        )
    }
}