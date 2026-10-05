package com.velora.app.features.onboarding

data class OnboardingState(
    val name: String = "",
    val intention: String? = null,
    val focusAreas: Set<String> = emptySet(),
    val preferredTime: String? = null,
    val interests: Set<String> = emptySet()
)