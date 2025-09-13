package com.example.coinsphere

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coinsphere.components.CryptoRow
import com.example.coinsphere.components.InfoCard
import com.example.coinsphere.models.SampleData
import com.example.coinsphere.models.monedas
import com.example.coinsphere.ui.theme.Background
import com.example.coinsphere.ui.theme.CoinSphereTheme

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
        InfoCard("Global Market Cap", "$2.18T")
        InfoCard("Fear & Greed", "Neutral (54)")
        InfoCard("Altcoin Season", "No")

        LazyColumn(modifier = Modifier.fillMaxSize()) {
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