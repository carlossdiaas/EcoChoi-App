package com.fiap.br.ecochoice.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.DirectionsBike
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.Train
import androidx.compose.material.icons.filled.DirectionsWalk

data class TransportOption(
    val type: String,   // Nome do transporte (Carro, Bicicleta, etc.)
    val emission: Double, // Emissão estimada (kg de CO₂ por km)
    val icon: ImageVector
)


// Lista de opções de transporte
val transportOptions = listOf(
    TransportOption("Carro", 0.21, Icons.Filled.DirectionsCar),
    TransportOption("Ônibus", 0.10, Icons.Filled.DirectionsBus),
    TransportOption("Bicicleta", 0.0, Icons.Filled.DirectionsBike),
    TransportOption("Metrô", 0.05, Icons.Filled.Train),
    TransportOption("Caminhada", 0.0, Icons.Filled.DirectionsWalk)
)
