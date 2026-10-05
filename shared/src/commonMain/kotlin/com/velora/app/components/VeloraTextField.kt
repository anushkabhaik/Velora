package com.velora.app.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.velora.app.core.design.VeloraColors
import com.velora.app.core.design.VeloraDimensions

@Composable
fun VeloraTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
    singleLine: Boolean = true
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        singleLine = singleLine,
        placeholder = {
            Text(
                text = placeholder,
                color = VeloraColors.TextMuted
            )
        },
        textStyle = MaterialTheme.typography.bodyLarge,
        shape = RoundedCornerShape(
            VeloraDimensions.RadiusMedium
        ),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = VeloraColors.Divider,
            focusedContainerColor = VeloraColors.Card,
            unfocusedContainerColor = VeloraColors.Card,
            cursorColor = MaterialTheme.colorScheme.primary
        )
    )
}