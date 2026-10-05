package com.velora.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.velora.app.core.design.VeloraTheme
import com.velora.app.features.onboarding.OnboardingFlow
import com.velora.app.features.onboarding.WelcomeScreen

private enum class AppScreen {
    WELCOME,
    ONBOARDING
}

@Composable
fun App() {

    var currentScreen by remember {
        mutableStateOf(AppScreen.WELCOME)
    }

    VeloraTheme {

        when (currentScreen) {

            AppScreen.WELCOME -> {
                WelcomeScreen(
                    onGetStarted = {
                        currentScreen = AppScreen.ONBOARDING
                    },

                    onLogin = {
                        // Authentication arrives in Milestone 3.
                    }
                )
            }

            AppScreen.ONBOARDING -> {
                OnboardingFlow(
                    onBackToWelcome = {
                        currentScreen = AppScreen.WELCOME
                    }
                )
            }
        }
    }
}