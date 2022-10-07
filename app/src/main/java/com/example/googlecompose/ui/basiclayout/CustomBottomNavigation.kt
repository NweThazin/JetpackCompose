package com.example.googlecompose.ui.basiclayout

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.googlecompose.R
import androidx.compose.ui.res.stringResource

@Composable
fun CustomBottomNavigation(modifier: Modifier = Modifier) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        modifier = modifier
    ) {
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(imageVector = Icons.Default.Spa, contentDescription = null)
            },
            label = {
                Text(stringResource(R.string.bottom_navigation_home))
            },
        )
        BottomNavigationItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            },
            label = {
                Text(stringResource(R.string.bottom_navigation_profile))
            },
        )
    }
}