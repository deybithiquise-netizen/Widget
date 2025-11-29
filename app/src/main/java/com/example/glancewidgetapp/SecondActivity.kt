package com.example.glancewidgetapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.glancewidgetapp.ui.theme.GlanceWidgetAppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GlanceWidgetAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { padding ->

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(padding)
                            .padding(20.dp)
                    ) {
                        Text(text = "Segunda Vista", modifier = Modifier.padding(bottom = 16.dp))

                        Button(onClick = { finish() }) {
                            Text(text = "Regresar")
                        }
                    }

                }
            }
        }
    }
}
