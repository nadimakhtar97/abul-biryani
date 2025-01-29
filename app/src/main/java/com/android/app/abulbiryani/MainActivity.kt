package com.android.app.abulbiryani

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainLayout(Modifier
                .fillMaxHeight()
                .fillMaxWidth())
        }
    }
}

@Preview
@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    var selectedItem by rememberSaveable { mutableIntStateOf(0) }
    Scaffold(
        topBar = { AppBar() },
        bottomBar = { NavigationBar(selectedItem = selectedItem, onNavigationSelected = { selectedItem = it }) }
    ) { padding ->
        when (selectedItem) {
            0 -> FoodList(padding)
            1 -> Cart(padding)
            2 -> Profile(padding)
        }
    }

}




