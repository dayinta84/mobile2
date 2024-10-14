package com.example.juicetracker.ui.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.example.juicetracker.R
import com.example.juicetracker.data.JuiceColor

@Composable
fun JuiceIcon(color: String, modifier: Modifier = Modifier) {
    val juiceIconContentDescription = stringResource(R.string.juice_color, color)
    val juiceColor = try {
        JuiceColor.valueOf(color).color
    } catch (e: IllegalArgumentException) {
        Color.Gray
    }

    Box(
        modifier = modifier.semantics {
            contentDescription = juiceIconContentDescription
        }
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_juice_color),
            contentDescription = null,
            tint = juiceColor,
            modifier = Modifier.align(Alignment.Center)
        )
        Icon(
            painter = painterResource(R.drawable.ic_juice_clear),
            contentDescription = null,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
