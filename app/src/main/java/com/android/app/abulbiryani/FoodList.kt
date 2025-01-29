package com.android.app.abulbiryani

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.android.app.abulbiryani.model.FoodItem

@Composable
fun FoodList(contentPadding: PaddingValues) {
    LazyColumn(
        modifier = Modifier.padding(paddingValues = contentPadding),
        content = {
            items(foodList.size) {
                Item(modifier = Modifier.padding(10.dp), image = foodList[it].image, imgContentDescription = foodList[it].imgContentDescription,
                    itemName = foodList[it].itemName, itemDescription = foodList[it].itemDescription, itemCost = foodList[it].itemCost)
            }
        }
    )

}


@Composable
fun Item(modifier: Modifier = Modifier, image: Int, imgContentDescription: String, itemName: String, itemDescription: String, itemCost: Int) {
    val itemCount = remember { mutableStateOf(0) }
    Card(modifier = modifier) {
        Row(Modifier.fillMaxWidth().padding(5.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
            Image(painterResource(image), imgContentDescription, Modifier.size(height = 100.dp, width = 100.dp).clip(
                RoundedCornerShape(10.dp)
            ), contentScale = ContentScale.Crop)
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
                Text(itemName)
                Text(itemDescription)
                Text(itemCost.toString())
            }
            Button(onClick = { itemCount.value++ }) {
                if(itemCount.value <= 0) {
                    Icon(Icons.Filled.AddShoppingCart, contentDescription = "Add to cart")
                } else {
                    Icon(Icons.Filled.Add, contentDescription = "Add", modifier = Modifier.padding(5.dp).clickable { itemCount.value++ })
                    Text(itemCount.value.toString())
                    Icon(Icons.Filled.Remove, contentDescription = "Remove", modifier = Modifier.padding(5.dp).clickable { itemCount.value--})
                }
            }
        }
    }
}


val foodList = listOf(
    FoodItem(R.drawable.biryani, "biryani", "Biryani", "Biryani", 100),
    FoodItem(R.drawable.raita, "raita", "Raita", "Raita", 100),
    FoodItem(R.drawable.pepsi, "pepsi", "Pepsi", "Pepsi", 100),
    FoodItem(R.drawable.butter_chicken, "butter chicken", "Butter chicken", "Butter chicken", 100),
    FoodItem(R.drawable.laccha_paratha, "laccha paratha", "Laccha paratha", "Laccha paratha", 100),
    FoodItem(R.drawable.biryani, "biryani", "Biryani", "Biryani", 100),
    FoodItem(R.drawable.raita, "raita", "Raita", "Raita", 100),
    FoodItem(R.drawable.pepsi, "pepsi", "Pepsi", "Pepsi", 100),
    FoodItem(R.drawable.butter_chicken, "butter chicken", "Butter chicken", "Butter chicken", 100),
    FoodItem(R.drawable.laccha_paratha, "laccha paratha", "Laccha paratha", "Laccha paratha", 100),
    FoodItem(R.drawable.biryani, "biryani", "Biryani", "Biryani", 100),
    FoodItem(R.drawable.raita, "raita", "Raita", "Raita", 100),
    FoodItem(R.drawable.pepsi, "pepsi", "Pepsi", "Pepsi", 100),
    FoodItem(R.drawable.butter_chicken, "butter chicken", "Butter chicken", "Butter chicken", 100),
    FoodItem(R.drawable.laccha_paratha, "laccha paratha", "Laccha paratha", "Laccha paratha", 100),
    FoodItem(R.drawable.biryani, "biryani", "Biryani", "Biryani", 100),
    FoodItem(R.drawable.raita, "raita", "Raita", "Raita", 100),
    FoodItem(R.drawable.pepsi, "pepsi", "Pepsi", "Pepsi", 100),
    FoodItem(R.drawable.butter_chicken, "butter chicken", "Butter chicken", "Butter chicken", 100),
    FoodItem(R.drawable.laccha_paratha, "laccha paratha", "Laccha paratha", "Laccha paratha", 100)
)