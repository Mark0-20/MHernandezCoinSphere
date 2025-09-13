package com.example.coinsphere.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.coinsphere.models.monedas
import com.example.coinsphere.ui.theme.SurfaceColor
import com.example.coinsphere.ui.theme.TextDim
import com.example.coinsphere.ui.theme.TextMain
import coil.compose.AsyncImage


@Composable
fun CryptoRow(crypto: monedas, modifier: Modifier = Modifier) {
    Card(
        colors = CardDefaults.cardColors(containerColor = SurfaceColor),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(bottom = 10.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                // rank
                Text(
                    text = "${crypto.rank}",
                    color = TextDim,
                    modifier = Modifier.width(28.dp)
                )

                Spacer(modifier = Modifier.width(6.dp))

                AsyncImage(
                    model = crypto.imageUrl,
                    contentDescription = crypto.name,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(RoundedCornerShape(8.dp))
                )

                Spacer(modifier = Modifier.width(12.dp))

                Text(text = crypto.name, color = TextMain)
            }

            Text(text = crypto.price, color = TextMain)
        }
    }
}
