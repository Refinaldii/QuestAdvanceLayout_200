package com.example.questadvancelayout_200

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF000080))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Foto Profil
        Image(
            painter = painterResource(id = R.drawable.ratatuli),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 🔹 Baris ikon kecil (4 logo sejajar)
        Row(
            modifier = Modifier.padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "Icon 1",
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.instagram),
                contentDescription = "Icon 2",
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.whatsappicon),
                contentDescription = "Icon 3",
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.youtube),
                contentDescription = "Icon 4",
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Nama dan deskripsi
        Text(
            text = "Muhammad Refinaldi Alif",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "@SiapaYo",
            color = Color.Gray,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Saya Adalah Manusia",
            color = Color.White,
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(24.dp))

        ButtonCard("Privacy")
        ButtonCard("Riwayat Transaksi")
        ButtonCard("Pengaturan")
    }
}

@Composable
fun ButtonCard(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFF1E1E1E))
    ) {
        Box(
            modifier = Modifier.padding(16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(text = text, color = Color.White)
        }
    }
}
