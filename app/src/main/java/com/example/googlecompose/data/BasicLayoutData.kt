package com.example.googlecompose.data

import com.example.googlecompose.R
import com.example.googlecompose.model.DrawableStringPair

val alignYourBodyData = listOf(
    R.drawable.qoobee1 to R.string.label_working_hard,
    R.drawable.qoobee2 to R.string.label_qoobee2,
    R.drawable.qoobee3 to R.string.label_qoobee3,
    R.drawable.qoobee4 to R.string.label_qoobee4,
    R.drawable.qoobee5 to R.string.label_qoobee5,
    R.drawable.qoobee6 to R.string.label_qoobee6
).map { DrawableStringPair(it.first, it.second) }