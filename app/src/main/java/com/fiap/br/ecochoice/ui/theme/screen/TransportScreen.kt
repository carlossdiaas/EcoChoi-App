package com.fiap.br.ecochoice.ui.theme.screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fiap.br.ecochoice.data.transportOptions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TransportScreen(navController: NavController) {
    var selectedTransport by remember { mutableStateOf(transportOptions[0]) }
    var distance by remember { mutableStateOf("") }
    var emissionResult by remember { mutableStateOf<Double?>(null) }

    // Cor padrão do botão
    val defaultButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color.Transparent, // Fundo transparente
        contentColor = Color(0xFF2E7D32) // Cor do texto verde escuro
    )

    // Cor do botão quando selecionado
    val selectedButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color(0x8002BD11), // Verde claro com transparência
        contentColor = Color.White // Cor do texto branco
    )

    // Cor da borda
    val borderColor = Color(0xFF2E7D32) // Verde escuro

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Voltar")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0x8002BD11))
            )
        },
        containerColor = Color(0xFFF5F8F3) // Fundo verde claro
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Escolha um meio de transporte:", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(50.dp))

            // Botões de transporte
            transportOptions.forEach { transport ->
                val isSelected = selectedTransport == transport
                Button(
                    onClick = { selectedTransport = transport },
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(64.dp)
                        .padding(vertical = 8.dp),
                    colors = if (isSelected) selectedButtonColors else defaultButtonColors,
                    border = BorderStroke(2.dp, borderColor) // Adiciona a borda
                ) {
                    Text(transport.type, fontSize = 20.sp)
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            // Input de distância
            OutlinedTextField(
                value = distance,
                onValueChange = { distance = it },
                label = { Text("Distância (km)", fontSize = 20.sp) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .clip(RoundedCornerShape(12.dp)),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(0xFF4CAF50), // Verde vibrante
                    unfocusedBorderColor = Color(0xFF2E7D32), // Verde escuro
                    cursorColor = Color(0xFF4CAF50) // Cor do cursor ao digitar
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Botão Calcular Impacto
            Button(
                onClick = {
                    val dist = distance.toDoubleOrNull() ?: 0.0
                    emissionResult = dist * selectedTransport.emission
                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(64.dp)
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFA0228)) // Cor de fundo verde escuro
            ) {
                Text("Calcular Impacto", fontSize = 22.sp)
            }

            Spacer(modifier = Modifier.height(16.dp))

            emissionResult?.let { emission ->
                val emissionColor = when {
                    emission == 0.0 -> Color(0xFF008000) // Verde
                    emission in 0.1..100.0 -> Color.Black // Preto
                    else -> Color.Red // Vermelho
                }
                Text(
                    "Emissão estimada: %.2f kg CO₂".format(emission),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = emissionColor
                )
            }
        }
    }
}