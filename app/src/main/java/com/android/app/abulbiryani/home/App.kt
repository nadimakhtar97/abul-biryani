package com.android.app.abulbiryani.home

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.app.abulbiryani.cart.Cart
import com.android.app.abulbiryani.menu.FoodList
import com.android.app.abulbiryani.profile.Profile

@Preview(showBackground = true)
@Composable
fun App(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    var selectedItem by rememberSaveable { mutableIntStateOf(1) }
    Scaffold(
        topBar = { AppBar() },
        bottomBar = { NavigationBar(selectedItem = selectedItem, onNavigationSelected = { selectedItem = it }) }
    ) { padding ->
        NavHost(navController, startDestination = "menu") {
            composable("menu") { FoodList(padding, navController) }
            composable("cart") { Cart(padding, navController) }
            composable("profile") { Profile(padding, navController) }
        }
    }
}