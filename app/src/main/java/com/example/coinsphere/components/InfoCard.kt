package com.example.coinsphere.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.coinsphere.ui.theme.SurfaceColor
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain

//InfoCard para reutilizarse en el HomeScreen
@Composable
fun InfoCard(titulo: String, contenido: String, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = SurfaceColor),
        modifier = modifier.fillMaxWidth()
            .padding(bottom = 10.dp)
    ) {
        Column (modifier = Modifier.padding(12.dp)) {
            Text(text = titulo, color = TextDim)
            Text(text = contenido, color = TextMain)
        }
    }
}
