package com.david.rickmortyapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.david.rickmortyapp.ui.core.navigation.NavigationWrapper
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        NavigationWrapper()
    }
}