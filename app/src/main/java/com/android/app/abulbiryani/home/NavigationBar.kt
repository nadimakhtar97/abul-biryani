package com.android.app.abulbiryani.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Fastfood
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NavigationBar(modifier: Modifier = Modifier, selectedItem: Int, onNavigationSelected: (Int) -> Unit ) {
    val items = listOf("Menu", "Cart", "Profile")
    val selectedIcons = listOf(Icons.Filled.Fastfood, Icons.Filled.ShoppingCart, Icons.Filled.Person)
    val unselectedIcons = listOf(Icons.Filled.Fastfood, Icons.Filled.ShoppingCart, Icons.Filled.Person)

    NavigationBar {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        if (selectedItem == index) selectedIcons[index] else unselectedIcons[index],
                        contentDescription = item
                    )
                },
                label = { Text(item) },
                selected = selectedItem == index,
                onClick = {
                    onNavigationSelected(index)
                }
            )
        }
    }
}

