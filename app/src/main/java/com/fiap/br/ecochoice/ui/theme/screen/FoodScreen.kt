package com.fiap.br.ecochoice.ui.theme.screen

import androidx.activity.result.launch
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import coil.compose.rememberImagePainter
//import com.fiap.br.ecochoice.data.FoodApiService
//import com.fiap.br.ecochoice.data.FoodProduct
//import kotlinx.coroutines.launch
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun FoodScreen(navController: NavController) {
//    var barcode by remember { mutableStateOf("") }
//    var foodInfo by remember { mutableStateOf<FoodProduct?>(null) }
//    val coroutineScope = rememberCoroutineScope()
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Impacto Alimentar", fontSize = 20.sp) },
//                navigationIcon = {
//                    IconButton(onClick = { navController.popBackStack() }) {
//                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Voltar")
//                    }
//                }
//            )
//        },
//        containerColor = Color(0xFFF5F5F5) // Fundo levemente acinzentado
//    ) { padding ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp, vertical = 16.dp),
//            verticalArrangement = Arrangement.Top,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Text(
//                "Digite o código de barras do produto:",
//                style = MaterialTheme.typography.titleLarge,
//                color = Color(0xFF2E7D32) // Verde escuro para destaque
//            )
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            OutlinedTextField(
//                value = barcode,
//                onValueChange = { barcode = it },
//                label = { Text("Código de Barras", fontSize = 18.sp) },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clip(RoundedCornerShape(12.dp))
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Button(
//                onClick = {
//                    coroutineScope.launch {
//                        foodInfo = FoodApiService.getFoodInfo(barcode)
//                    }
//                },
//                shape = RoundedCornerShape(12.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)), // Verde vibrante
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
//            ) {
//                Text("Buscar Produto", fontSize = 18.sp, color = Color.White)
//            }
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            foodInfo?.let { food ->
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .clip(RoundedCornerShape(16.dp))
//                        .background(Color.White)
//                        .padding(16.dp),
//                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(food.name, style = MaterialTheme.typography.titleMedium, color = Color(0xFF1B5E20))
//                        food.brand?.let {
//                            Text("Marca: $it", fontSize = 16.sp, color = Color(0xFF388E3C))
//                        }
//                        Text("Pegada de Carbono: ${food.carbonFootprint} kg CO₂", fontSize = 16.sp, color = Color(0xFFD32F2F))
//
//                        Spacer(modifier = Modifier.height(12.dp))
//
//                        food.imageUrl?.let { imageUrl ->
//                            val imagePainter: Painter = rememberImagePainter(data = imageUrl)
//                            Image(
//                                painter = imagePainter,
//                                contentDescription = "Imagem do Produto",
//                                modifier = Modifier
//                                    .size(120.dp)
//                                    .clip(RoundedCornerShape(12.dp)),
//                                contentScale = ContentScale.Crop
//                            )
//                        }
//                    }
//                }
//            }
//        }
//    }
//}


//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text.KeyboardOptions
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowBack
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import coil.compose.rememberImagePainter
//import com.fiap.br.ecochoice.data.FoodApiService
//import com.fiap.br.ecochoice.data.FoodProduct
//import kotlinx.coroutines.launch
//import androidx.compose.ui.platform.LocalContext
//import android.widget.Toast
//import androidx.compose.ui.res.painterResource
//import coil.compose.AsyncImage
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun FoodScreen(navController: NavController) {
//    var barcode by remember { mutableStateOf("") }
//    var foodInfo by remember { mutableStateOf<FoodProduct?>(null) }
//    val coroutineScope = rememberCoroutineScope()
//    val context = LocalContext.current // Para exibir Toasts
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text("Impacto Alimentar", fontSize = 20.sp) },
//                navigationIcon = {
//                    IconButton(onClick = { navController.popBackStack() }) {
//                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Voltar")
//                    }
//                }
//            )
//        },
//        containerColor = Color(0xFFF5F5F5) // Fundo levemente acinzentado
//    ) { padding ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp, vertical = 16.dp),
//            verticalArrangement = Arrangement.Top,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Text(
//                "Digite o código de barras do produto:",
//                style = MaterialTheme.typography.titleLarge,
//                color = Color(0xFF2E7D32) // Verde escuro para destaque
//            )
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            OutlinedTextField(
//                value = barcode,
//                onValueChange = { barcode = it },
//                label = { Text("Código de Barras", fontSize = 18.sp) },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .clip(RoundedCornerShape(12.dp))
//            )
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            Button(
//                onClick = {
//                    if (barcode.isNotEmpty()) {
//                        coroutineScope.launch {
//                            foodInfo = try {
//                                FoodApiService.getFoodInfo(barcode)
//                            } catch (e: Exception) {
//                                // Lidar com erros de conexão ou outros
//                                Toast.makeText(context, "Erro ao buscar produto: ${e.message}", Toast.LENGTH_SHORT).show()
//                                null
//                            }
//                        }
//                    } else {
//                        Toast.makeText(context, "Por favor, insira um código de barras.", Toast.LENGTH_SHORT).show()
//                    }
//                },
//                shape = RoundedCornerShape(12.dp),
//                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)), // Verde vibrante
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp)
//            ) {
//                Text("Buscar Produto", fontSize = 18.sp, color = Color.White)
//            }
//
//            Spacer(modifier = Modifier.height(24.dp))
//
//            // Exibir Card ou Mensagem de Erro
//            foodInfo?.let { food ->
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .clip(RoundedCornerShape(16.dp))
//                        .background(Color.White)
//                        .padding(16.dp),
//                    elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxWidth(),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Text(food.name, style = MaterialTheme.typography.titleMedium, color = Color(0xFF1B5E20))
//                        food.brand?.let {
//                            Text("Marca: $it", fontSize = 16.sp, color = Color(0xFF388E3C))
//                        }
//                        Text("Pegada de Carbono: ${food.carbonFootprint} kg CO₂", fontSize = 16.sp, color = Color(0xFFD32F2F))
//
//                        Spacer(modifier = Modifier.height(12.dp))
//
//                        food.imageUrl?.let { imageUrl ->
//                            AsyncImage(
//                                model = imageUrl,
//                                contentDescription = "Imagem do Produto",
//                                modifier = Modifier
//                                    .size(120.dp)
//                                    .clip(RoundedCornerShape(12.dp)),
//                                contentScale = ContentScale.Crop,
//                                placeholder = painterResource(id = android.R.drawable.ic_menu_gallery),
//                                error = painterResource(id = android.R.drawable.ic_menu_report_image)
//                            )
//                        }
//                    }
//                }
//            } ?: run {
//                Text("Produto não encontrado ou erro ao buscar informações.", color = Color.Red)
//            }
//        }
//    }
//}




import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.fiap.br.ecochoice.R
import com.fiap.br.ecochoice.data.FoodApiService
import com.fiap.br.ecochoice.data.FoodProduct
import kotlinx.coroutines.launch
import android.util.Log

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FoodScreen(navController: NavController) {
    var barcode by remember { mutableStateOf("") }
    var foodInfo by remember { mutableStateOf<FoodProduct?>(null) }
    var isLoading by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current

    // LaunchedEffect para observar mudanças em barcode
    LaunchedEffect(barcode) {
        if (barcode.length >= 8) {
            isLoading = true
            try {
                val result = FoodApiService.getFoodInfo(barcode)
                foodInfo = result
                Log.d("FoodScreen", "Produto encontrado: $result")
            } catch (e: Exception) {
                val errorMessage = when (e) {
                    is java.net.UnknownHostException -> "Erro de conexão. Verifique sua internet e tente novamente."
                    else -> "Erro ao buscar produto: ${e.message}"
                }
                Log.e("FoodScreen", "Erro ao buscar produto: $errorMessage", e)
                Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
                foodInfo = null
            } finally {
                isLoading = false
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Impacto Alimentar", fontSize = 20.sp) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Voltar")
                    }
                }
            )
        },
        containerColor = Color(0xFFF5F5F5)
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "Digite o código de barras do produto:",
                style = MaterialTheme.typography.titleLarge,
                color = Color(0xFF2E7D32)
            )

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedTextField(
                value = barcode,
                onValueChange = { barcode = it },
                label = { Text("Código de Barras", fontSize = 18.sp) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (barcode.length >= 8) {
                        coroutineScope.launch {
                            isLoading = true
                            try {
                                val result = FoodApiService.getFoodInfo(barcode)
                                foodInfo = result
                                Log.d("FoodScreen", "Produto encontrado: $result")
                            } catch (e: Exception) {
                                val errorMessage = when (e) {
                                    is java.net.UnknownHostException -> "Erro de conexão. Verifique sua internet e tente novamente."
                                    else -> "Erro ao buscar produto: ${e.message}"
                                }
                                Log.e("FoodScreen", "Erro ao buscar produto: $errorMessage", e)
                                Toast.makeText(context, errorMessage, Toast.LENGTH_SHORT).show()
                                foodInfo = null
                            } finally {
                                isLoading = false
                            }
                        }
                    } else {
                        Toast.makeText(context, "Por favor, insira um código de barras válido.", Toast.LENGTH_SHORT).show()
                    }
                },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Buscar Produto", fontSize = 18.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(24.dp))

            if (isLoading) {
                CircularProgressIndicator()
            } else {
                // Exibir Card ou Mensagem de Erro
                if (foodInfo != null) {
                    FoodCard(food = foodInfo!!)
                } else if (barcode.length >= 8) {
                    Text("Produto não encontrado.", color = Color.Red)
                } else {
                    Text(" ", color = Color.Red)
                }
            }
        }
    }
}

@Composable
fun FoodCard(food: FoodProduct) {
    Log.d("FoodCard", "food.imageUrl: ${food.imageUrl}")
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color.Gray),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(food.name, style = MaterialTheme.typography.titleMedium, color = Color(0xFF1B5E20))
            food.brand?.let {
                Text("Marca: $it", fontSize = 16.sp, color = Color(0xFF388E3C))
            }
            Text("Pegada de Carbono: ${food.carbonFootprint} kg CO₂", fontSize = 16.sp, color = Color(0xFFD32F2F))

            Spacer(modifier = Modifier.height(12.dp))

            food.imageUrl?.let { imageUrl ->
                AsyncImage(
                    model = imageUrl,
                    contentDescription = "Imagem do Produto",
                    modifier = Modifier
                        .size(120.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    contentScale = ContentScale.Crop,
                    placeholder = painterResource(id = R.drawable.aguade),
                    error = painterResource(id = R.drawable.imagem_erro)
                )
            }
        }
    }
}
