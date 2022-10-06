package com.example.googlecompose.ui.basiclayout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlecompose.R

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        placeholder = {
            Text(text = stringResource(id = R.string.placeholder_search))
        },
        colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface),
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search, // use default icon
                contentDescription = "Search"
            )
        },
        value = "",
        onValueChange = {},
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSearchBar() {
    SearchBar()
}