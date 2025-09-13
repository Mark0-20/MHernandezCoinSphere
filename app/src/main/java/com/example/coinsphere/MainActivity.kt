package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinsphere.components.CryptoRow
import com.example.coinsphere.components.InfoCard
import com.example.coinsphere.models.SampleData
import com.example.coinsphere.models.monedas
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme
import com.example.coinsphere.ui.theme.TextMain

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CoinSphereTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .background(color = Background)
        .fillMaxSize()
        .padding(16.dp)){

        Text(text = "CoinSphere",
            color = TextMain,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(10.dp)
        )

        InfoCard("Global Market Cap", "$2.18T")
        InfoCard("Fear & Greed", "Neutral (54)")
        InfoCard("Altcoin Season", "No")

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "#", color = TextMain, fontSize = 14.sp)
            Text(text = "Name", color = TextMain, fontSize = 14.sp)
            Text(text = "Price", color = TextMain, fontSize = 14.sp)
        }

        LazyColumn(modifier = Modifier.fillMaxSize()
            .padding(15.dp)) {
            items(SampleData.top10) { moneda ->
                CryptoRow(crypto = moneda)
            }
        }
    }

}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    CoinSphereTheme {
        HomeScreen()
    }
}