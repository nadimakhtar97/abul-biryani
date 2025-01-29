package com.android.app.abulbiryani

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Profile(paddingValues: PaddingValues) {

    Column(modifier = Modifier.padding(paddingValues).fillMaxWidth().fillMaxHeight()) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(painterResource(R.drawable.profile), "profile", Modifier
                .padding(20.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop)
            Column {
                Text("User Name")
                Text("+911234567890")
            }
        }
        Button(onClick = { /*todo*/}, modifier = Modifier.padding(20.dp)) {
            Text("Order history")
        }
        Button(onClick = { /*todo*/}, modifier = Modifier.padding(20.dp)) {
            Text("Edit Profile")
        }
        Button(onClick = { /*todo*/}, modifier = Modifier.padding(20.dp)) {
            Text("Logout")
        }

    }

}