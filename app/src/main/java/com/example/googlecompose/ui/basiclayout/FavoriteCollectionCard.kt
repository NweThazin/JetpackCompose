package com.example.googlecompose.ui.basiclayout

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.googlecompose.R

@Composable
fun FavoriteCollectionCard(
    @StringRes title: Int,
    @DrawableRes drawable: Int,
    modifier: Modifier = Modifier
) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(192.dp)
        ) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(56.dp) // image height
            )
            Text(
                text = stringResource(id = title),
                style = MaterialTheme.typography.body2, // use body for text size
                modifier = Modifier.padding(horizontal = 16.dp) // left and right padding
            )
        }
    }
}

@Preview
@Composable
fun PreviewFavoriteCollectionCard() {
    FavoriteCollectionCard(
        R.string.label_working_hard,
        R.drawable.qoobee1,
        Modifier.padding(8.dp)
    )
}