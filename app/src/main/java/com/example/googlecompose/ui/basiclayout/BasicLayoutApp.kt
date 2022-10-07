package com.example.googlecompose.ui.basiclayout

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun BasicLayoutApp() {
    Scaffold(
        bottomBar = { CustomBottomNavigation() }
    ) {
        HomeScreen(Modifier.padding(it))
    }
}