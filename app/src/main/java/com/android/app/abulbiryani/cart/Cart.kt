package com.android.app.abulbiryani.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Cart(paddingValues: PaddingValues, navController: NavController) {
    Column(modifier = Modifier.padding(paddingValues).fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center) {
        Text(modifier = Modifier.fillMaxWidth().fillMaxHeight(), text = "Cart", fontSize = 50.sp, textAlign = TextAlign.Center)
    }
}