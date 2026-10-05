package com.velora.app.features.onboarding

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun OnboardingFlow(
    onBackToWelcome: () -> Unit
) {
    var onboardingState by remember {
        mutableStateOf(OnboardingState())
    }

    var currentStep by remember {
        mutableStateOf(OnboardingStep.NAME)
    }

    when (currentStep) {

        OnboardingStep.NAME -> {
            NameScreen(
                name = onboardingState.name,

                onNameChange = { newName ->
                    onboardingState = onboardingState.copy(
                        name = newName
                    )
                },

                onBack = onBackToWelcome,

                onContinue = {
                    currentStep = OnboardingStep.INTENTION
                }
            )
        }

        OnboardingStep.INTENTION -> {
            IntentionScreen(
                selectedIntention = onboardingState.intention,

                onIntentionSelected = { intention ->
                    onboardingState = onboardingState.copy(
                        intention = intention
                    )
                },

                onBack = {
                    currentStep = OnboardingStep.NAME
                },

                onContinue = {
                    currentStep = OnboardingStep.FOCUS_AREAS
                }
            )
        }

        OnboardingStep.FOCUS_AREAS -> {
            FocusAreasScreen(
                selectedAreas = onboardingState.focusAreas,

                onAreaToggle = { area ->

                    val updatedAreas =
                        if (area in onboardingState.focusAreas) {
                            onboardingState.focusAreas - area
                        } else {
                            onboardingState.focusAreas + area
                        }

                    onboardingState = onboardingState.copy(
                        focusAreas = updatedAreas
                    )
                },

                onBack = {
                    currentStep = OnboardingStep.INTENTION
                },

                onContinue = {
                    currentStep = OnboardingStep.DAILY_RHYTHM
                }
            )
        }

        else -> {
            ComingSoonOnboardingScreen(
                name = onboardingState.name,

                onBack = {
                    currentStep = OnboardingStep.FOCUS_AREAS
                }
            )
        }
    }
}