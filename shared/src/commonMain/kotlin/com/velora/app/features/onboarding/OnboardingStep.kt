package com.velora.app.features.onboarding

enum class OnboardingStep(
    val position: Int
) {
    NAME(1),
    INTENTION(2),
    FOCUS_AREAS(3),
    DAILY_RHYTHM(4),
    INTERESTS(5),
    COMPLETE(6)
}