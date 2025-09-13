package com.example.coinsphere.models

data class monedas(
    val rank: Int,
    val name: String,
    val price: String,
    val imageUrl: String
)

object SampleData {
    val top10 = listOf(
        monedas(1, "Bitcoin", "$109,797.37", "https://assets.coingecko.com/coins/images/1/large/bitcoin.png"),
        monedas(2, "Ethereum", "$4,321.21", "https://assets.coingecko.com/coins/images/279/large/ethereum.png"),
        monedas(3, "Tether", "$1.0000", "https://assets.coingecko.com/coins/images/325/large/Tether-logo.png"),
        monedas(4, "XRP", "$2.8100", "https://assets.coingecko.com/coins/images/44/large/xrp-symbol-white-128.png"),
        monedas(5, "BNB", "$845.0000", "https://assets.coingecko.com/coins/images/825/large/bnb-icon2_2x.png"),
        monedas(6, "Solana", "$201.8500", "https://assets.coingecko.com/coins/images/4128/large/solana.png"),
        monedas(7, "USDC", "$0.9998", "https://assets.coingecko.com/coins/images/6319/large/USD_Coin_icon.png"),
        monedas(8, "Dogecoin", "$0.1320", "https://assets.coingecko.com/coins/images/5/large/dogecoin.png"),
        monedas(9, "TRON", "$0.3630", "https://assets.coingecko.com/coins/images/1094/large/tron-logo.png"),
        monedas(10, "Polkadot", "$6.23", "https://assets.coingecko.com/coins/images/12171/large/polkadot.png")
    )
}