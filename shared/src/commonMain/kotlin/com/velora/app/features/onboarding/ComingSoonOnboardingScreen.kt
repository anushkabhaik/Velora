package com.velora.app.features.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun ComingSoonOnboardingScreen(
    name: String,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(VeloraDimensions.SpaceLG),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Nice to meet you, $name ✦",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onBackground,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Your next onboarding step is coming next.",
            style = MaterialTheme.typography.bodyLarge,
            color = VeloraColors.TextSecondary,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                vertical = VeloraDimensions.SpaceLG
            )
        )

        TextButton(
            onClick = onBack
        ) {
            Text(
                text = "← Back",
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}