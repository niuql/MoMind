package com.itmob.mind.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.itmob.mind.res.Res

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }

    Column {
        Icon(imageVector = Res.drawable.defAvatar(), contentDescription = null)

        Icon(imageVector = Res.drawable.state404(), contentDescription = null)

        Button(onClick = {
            text = "Hello, ${getPlatformName()}"
        }) {
            Text(text)
        }
    }
}
