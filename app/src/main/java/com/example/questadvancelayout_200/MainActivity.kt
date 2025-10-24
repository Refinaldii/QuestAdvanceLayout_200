package com.example.questadvancelayout_200

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questadvancelayout_200.ui.theme.QuestAdvanceLayout_200Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestAdvanceLayout_200Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // ✅ Ganti ActivityPertama jadi ProfileScreen
                    ProfileScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
