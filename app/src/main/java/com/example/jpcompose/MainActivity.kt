package com.example.jpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jpcompose.ui.theme.JPComposeTheme
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = androidx.compose.ui.Modifier
                    .background(Color.Cyan)
                    .fillMaxWidth()
                    .fillMaxHeight(0.5f)
                    .border(width = 10.dp,color = Color.Black)
                    .padding(10.dp)
                    .border(width = 5.dp,color = Color.Gray)
                    .padding(5.dp)
            ) {
                Text("Hello", modifier = androidx.compose.ui.Modifier.offset(50.dp, 10.dp))
                Spacer(modifier = androidx.compose.ui.Modifier.height(50.dp))
                Text("Mwe")
            }
        }
    }
}

