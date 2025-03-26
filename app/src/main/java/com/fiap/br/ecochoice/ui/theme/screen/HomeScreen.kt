package com.fiap.br.ecochoice.ui.theme.screen

//
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.setValue
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.fiap.br.ecochoice.R
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavController) {
//    // Estados para cada botão
//    var isTransportSelected by remember { mutableStateOf(false) }
//    var isFoodSelected by remember { mutableStateOf(false) }
//    var isTipsSelected by remember { mutableStateOf(false) }
//    var isProfileSelected by remember { mutableStateOf(false) }
//
//    // Cor padrão do botão
//    val defaultButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF2E7D32), // Verde escuro
//        contentColor = Color.White // Texto branco
//    )
//
//    // Cor do botão quando selecionado
//    val selectedButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF02BD11), // Verde claro
//        contentColor = Color.White
//    )
//
//    Scaffold(
//        containerColor = Color(0xFFF1F8E9) // Verde claro em toda a tela
//    ) { padding ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.logo1),
//                contentDescription = "Logo do App",
//                modifier = Modifier
//                    .size(180.dp)
//                    .clip(RoundedCornerShape(100.dp))
//                    .background(Color.White)
//            )
//
//            Spacer(modifier = Modifier.height(32.dp))
//
//            val buttonModifier = Modifier
//                .fillMaxWidth()
//                .height(64.dp)
//
//            // Botão Escolha de Transporte
//            Button(
//                onClick = {
//                    isTransportSelected = !isTransportSelected
//                    isFoodSelected = false
//                    isTipsSelected = false
//                    isProfileSelected = false
//                    navController.navigate("transport")
//                },
//                shape = RoundedCornerShape(12.dp),
//                modifier = buttonModifier.height(if (isTransportSelected) 72.dp else 64.dp),
//                colors = if (isTransportSelected) selectedButtonColors else defaultButtonColors
//            ) {
//                Text("Escolha de Transporte", fontSize = if (isTransportSelected) 24.sp else 22.sp)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Botão Escolha de Alimentação
//            Button(
//                onClick = {
//                    isFoodSelected = !isFoodSelected
//                    isTransportSelected = false
//                    isTipsSelected = false
//                    isProfileSelected = false
//                    navController.navigate("food")
//                },
//                shape = RoundedCornerShape(12.dp),
//                modifier = buttonModifier.height(if (isFoodSelected) 72.dp else 64.dp),
//                colors = if (isFoodSelected) selectedButtonColors else defaultButtonColors
//            ) {
//                Text("Escolha de Alimentação", fontSize = if (isFoodSelected) 24.sp else 22.sp)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Botão Dicas Sustentáveis
//            Button(
//                onClick = {
//                    isTipsSelected = !isTipsSelected
//                    isTransportSelected = false
//                    isFoodSelected = false
//                    isProfileSelected = false
//                    navController.navigate("tips")
//                },
//                shape = RoundedCornerShape(12.dp),
//                modifier = buttonModifier.height(if (isTipsSelected) 72.dp else 64.dp),
//                colors = if (isTipsSelected) selectedButtonColors else defaultButtonColors
//            ) {
//                Text("Dicas Sustentáveis", fontSize = if (isTipsSelected) 24.sp else 22.sp)
//            }
//
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Botão Meu Perfil
//            Button(
//                onClick = {
//                    isProfileSelected = !isProfileSelected
//                    isTransportSelected = false
//                    isFoodSelected = false
//                    isTipsSelected = false
//                    navController.navigate("profile")
//                },
//                shape = RoundedCornerShape(12.dp),
//                modifier = buttonModifier.height(if (isProfileSelected) 72.dp else 64.dp),
//                colors = if (isProfileSelected) selectedButtonColors else defaultButtonColors
//            ) {
//                Text("Meu Perfil", fontSize = if (isProfileSelected) 24.sp else 22.sp)
//            }
//        }
//    }
//}


//
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Brush
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.fiap.br.ecochoice.R
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavController) {
//    // Estados para cada botão
//    var isTransportSelected by remember { mutableStateOf(false) }
//    var isFoodSelected by remember { mutableStateOf(false) }
//    var isTipsSelected by remember { mutableStateOf(false) }
//    var isProfileSelected by remember { mutableStateOf(false) }
//
//    // Cor padrão do botão
//    val defaultButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF6AC403), // Verde escuro com transparência
//        contentColor = Color.White // Texto branco
//    )
//
//    // Cor do botão quando selecionado
//    val selectedButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF5CEE0D), // Verde claro com transparência
//        contentColor = Color.White
//    )
//
//    Scaffold(
//        modifier = Modifier.background(
//            brush = Brush.verticalGradient(
//                colors = listOf(
//                    Color(0xFFF1F8E9), // Verde claro
//                    Color(0xFFC8E6C9)  // Verde um pouco mais escuro
//                )
//            )
//        )
//    ) { padding ->
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(10.dp) // Espaçamento entre os itens
//        ) {
//            item {
//                Spacer(modifier = Modifier.height(8.dp)) // Espaçamento superior
//
//                Image(
//                    painter = painterResource(id = R.drawable.logo1),
//                    contentDescription = "Logo do App",
//                    modifier = Modifier
//                        .size(150.dp)
//                        .clip(RoundedCornerShape(100.dp))
//                        .background(Color.White)
//                )
//
//                Spacer(modifier = Modifier.height(16.dp)) // Espaçamento abaixo do logo
//
//                Text(
//                    text = "Suas escolhas refletem no futuro.",
//                    fontSize = 22.sp,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(horizontal = 32.dp)
//                )
//
//                Spacer(modifier = Modifier.height(8.dp)) // Espaçamento antes dos botões
//            }
//
//            item {
//                // Botão Escolha de Transporte
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter // Alinha o botão na parte inferior
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.transporte),
//                        contentDescription = "Transporte",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop // Ajusta a imagem para preencher o espaço
//                    )
//                    Button(
//                        onClick = {
//                            isTransportSelected = !isTransportSelected
//                            isFoodSelected = false
//                            isTipsSelected = false
//                            isProfileSelected = false
//                            navController.navigate("transport")
//                        },
//                        shape = RoundedCornerShape(50.dp), // Botão bem arredondado
//                        modifier = Modifier
//                            .width(150.dp)
//                            .height(40.dp),
//                        colors = if (isTransportSelected) selectedButtonColors else defaultButtonColors
//                    ) {
//                        Text(
//                            "Transporte",
//                            fontSize = if (isTransportSelected) 18.sp else 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                // Botão Escolha de Alimentação
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter // Alinha o botão na parte inferior
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.alimentacao),
//                        contentDescription = "Alimentação",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop // Ajusta a imagem para preencher o espaço
//                    )
//                    Button(
//                        onClick = {
//                            isFoodSelected = !isFoodSelected
//                            isTransportSelected = false
//                            isTipsSelected = false
//                            isProfileSelected = false
//                            navController.navigate("food")
//                        },
//                        shape = RoundedCornerShape(50.dp), // Botão bem arredondado
//                        modifier = Modifier
//                            .width(150.dp)
//                            .height(40.dp),
//                        colors = if (isFoodSelected) selectedButtonColors else defaultButtonColors
//                    ) {
//                        Text(
//                            "Alimentação",
//                            fontSize = if (isFoodSelected) 18.sp else 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                // Botão Dicas Sustentáveis
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter // Alinha o botão na parte inferior
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.dicas),
//                        contentDescription = "Dicas Sustentáveis",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop // Ajusta a imagem para preencher o espaço
//                    )
//                    Button(
//                        onClick = {
//                            isTipsSelected = !isTipsSelected
//                            isTransportSelected = false
//                            isFoodSelected = false
//                            isProfileSelected = false
//                            navController.navigate("tips")
//                        },
//                        shape = RoundedCornerShape(50.dp), // Botão bem arredondado
//                        modifier = Modifier
//                            .width(150.dp)
//                            .height(40.dp),
//                        colors = if (isTipsSelected) selectedButtonColors else defaultButtonColors
//                    ) {
//                        Text(
//                            "Dicas",
//                            fontSize = if (isTipsSelected) 18.sp else 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }

//            item {
//                // Botão Meu Perfil
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter // Alinha o botão na parte inferior
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.foto_perfil),
//                        contentDescription = "Meu Perfil",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop // Ajusta a imagem para preencher o espaço
//                    )
//                    Button(
//                        onClick = {
//                            isProfileSelected = !isProfileSelected
//                            isTransportSelected = false
//                            isFoodSelected = false
//                            isTipsSelected = false
//                            navController.navigate("profile")
//                             },
//                        shape = RoundedCornerShape(50.dp), // Botão bem arredondado
//                        modifier = Modifier
//                            .width(200.dp)
//                            .height(50.dp),
//
//                        colors = if (isProfileSelected) selectedButtonColors else defaultButtonColors
//                    ) {
//                        Text(
//                            "Perfil",
//                            fontSize = if (isProfileSelected) 18.sp else 16.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                Spacer(modifier = Modifier.height(16.dp)) // Espaçamento inferior
//            }
//        }
//    }
//}

//                modifier = buttonModifier.height(if (isProfileSelected) 72.dp else 64.dp),
//                colors = if (isProfileSelected) selectedButtonColors else defaultButtonColors
//            ) {
//                Text("Meu Perfil", fontSize = if (isProfileSelected) 24.sp else 22.sp)
//            }
//        }
//    }
//}




//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.fiap.br.ecochoice.R
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavController) {
//    // Cor padrão do botão
//    val defaultButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF2E7D32), // Verde escuro
//        contentColor = Color.White // Texto branco
//    )
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { }, // Título vazio, pois não queremos texto na TopAppBar
//                actions = {
//                    IconButton(onClick = { navController.navigate("profile") }) {
//                        Icon(
//                            imageVector = Icons.Filled.Person,
//                            contentDescription = "Meu Perfil",
//                            tint = Color.Black
//                        )
//                    }
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Transparent
//                )
//            )
//        }
//    ) { padding ->
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            item {
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Image(
//                    painter = painterResource(id = R.drawable.logo1),
//                    contentDescription = "Logo do App",
//                    modifier = Modifier
//                        .size(150.dp)
//                        .clip(RoundedCornerShape(100.dp))
//                        .background(Color.White)
//                )
//
//                Spacer(modifier = Modifier.height(16.dp))
//
//                Text(
//                    text = "Suas escolhas refletem no futuro.",
//                    fontSize = 22.sp,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(horizontal = 32.dp)
//                )
//
//                Spacer(modifier = Modifier.height(8.dp))
//            }
//
//            item {
//                // Botão Escolha de Transporte
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.transporte),
//                        contentDescription = "Transporte",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop
//                    )
//                    Button(
//                        onClick = { navController.navigate("transport") },
//                        shape = RoundedCornerShape(50.dp),
//                        modifier = Modifier
//                            .width(200.dp)
//                            .height(50.dp),
//                        colors = defaultButtonColors
//                    ) {
//                        Text(
//                            "Transporte",
//                            fontSize = 18.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                // Botão Escolha de Alimentação
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.alimentacao),
//                        contentDescription = "Alimentação",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop
//                    )
//                    Button(
//                        onClick = { navController.navigate("food") },
//                        shape = RoundedCornerShape(50.dp),
//                        modifier = Modifier
//                            .width(200.dp)
//                            .height(50.dp),
//                        colors = defaultButtonColors
//                    ) {
//                        Text(
//                            "Alimentação",
//                            fontSize = 18.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                // Botão Dicas Sustentáveis
//                Box(
//                    modifier = Modifier.fillMaxWidth(),
//                    contentAlignment = Alignment.BottomCenter
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.dicas),
//                        contentDescription = "Dicas Sustentáveis",
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .height(150.dp)
//                            .clip(RoundedCornerShape(20.dp)),
//                        contentScale = ContentScale.Crop
//                    )
//                    Button(
//                        onClick = { navController.navigate("tips") },
//                        shape = RoundedCornerShape(50.dp),
//                        modifier = Modifier
//                            .width(200.dp)
//                            .height(50.dp),
//                        colors = defaultButtonColors
//                    ) {
//                        Text(
//                            "Dicas",
//                            fontSize = 18.sp,
//                            fontWeight = FontWeight.Bold
//                        )
//                    }
//                }
//            }
//
//            item {
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//        }
//    }
//}



//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.Person
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavController
//import com.fiap.br.ecochoice.R
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun HomeScreen(navController: NavController) {
//    // Cor padrão do botão
//    val defaultButtonColors = ButtonDefaults.buttonColors(
//        containerColor = Color(0xFF2E7D32), // Verde escuro
//        contentColor = Color.White // Texto branco
//    )
//
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { }, // Título vazio, pois não queremos texto na TopAppBar
//                actions = {
//                    IconButton(onClick = { navController.navigate("profile") }) {
//                        Icon(
//                            imageVector = Icons.Filled.Person,
//                            contentDescription = "Meu Perfil",
//                            modifier = Modifier
//                                .size(70.dp),
//                            tint = Color.Black
//                        )
//                    }
//                },
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Transparent
//                )
//            )
//
//            Image(
//                painter = painterResource(id = R.drawable.logo1),
//                contentDescription = "Logo do App",
//                modifier = Modifier
//                    .size(70.dp)
//                    .clip(RoundedCornerShape(100.dp))
//                    .background(Color.White)
//            )
//
//        }
//
//
//    ) { padding ->
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(padding)
//                .padding(horizontal = 24.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.spacedBy(10.dp)
//        ) {
//            item {
//                Spacer(modifier = Modifier.height(8.dp))
//
//
//
//                Spacer(modifier = Modifier.height(4.dp))
//
//                Text(
//                    text = "Suas escolhas refletem no futuro.",
//                    fontSize = 22.sp,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier.padding(horizontal = 32.dp)
//                )
//
//                Spacer(modifier = Modifier.height(8.dp))
//            }
//
//            item {
//                // Card Escolha de Transporte
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(220.dp),
//                    shape = RoundedCornerShape(20.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Bottom
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.transporte),
//                            contentDescription = "Transporte",
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .weight(1f) // A imagem ocupa a maior parte do espaço
//                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
//                            contentScale = ContentScale.Crop
//                        )
//                        Spacer(modifier = Modifier.height(8.dp))
//
//                        Button(
//                            onClick = { navController.navigate("transport") },
//                            shape = RoundedCornerShape(50.dp),
//                            modifier = Modifier
//                                .width(200.dp)
//                                .height(50.dp)
//                                .padding(bottom = 8.dp),
//                            colors = defaultButtonColors
//                        ) {
//                            Text(
//                                "Transporte",
//                                fontSize = 18.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//                }
//            }
//
//            item {
//                // Card Escolha de Alimentação
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(220.dp),
//                    shape = RoundedCornerShape(20.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Bottom
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.alimentacao),
//                            contentDescription = "Alimentação",
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .weight(1f) // A imagem ocupa a maior parte do espaço
//                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
//                            contentScale = ContentScale.Crop
//                        )
//
//                        Spacer(modifier = Modifier.height(8.dp))
//
//
//                        Button(
//                            onClick = { navController.navigate("food") },
//                            shape = RoundedCornerShape(50.dp),
//                            modifier = Modifier
//                                .width(200.dp)
//                                .height(50.dp)
//                                .padding(bottom = 8.dp),
//                            colors = defaultButtonColors
//                        ) {
//                            Text(
//                                "Alimentação",
//                                fontSize = 18.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//                }
//            }
//
//            item {
//                // Card Dicas Sustentáveis
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .height(220.dp),
//                    shape = RoundedCornerShape(20.dp)
//                ) {
//                    Column(
//                        modifier = Modifier.fillMaxSize(),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Bottom
//                    ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.dicas),
//                            contentDescription = "Dicas Sustentáveis",
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .weight(1f) // A imagem ocupa a maior parte do espaço
//                                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
//                            contentScale = ContentScale.Crop
//                        )
//                        Spacer(modifier = Modifier.height(8.dp))
//
//
//                        Button(
//                            onClick = { navController.navigate("tips") },
//                            shape = RoundedCornerShape(50.dp),
//                            modifier = Modifier
//                                .width(200.dp)
//                                .height(50.dp)
//                                .padding(bottom = 8.dp),
//                            colors = defaultButtonColors
//                        ) {
//                            Text(
//                                "Dicas",
//                                fontSize = 18.sp,
//                                fontWeight = FontWeight.Bold
//                            )
//                        }
//                    }
//                }
//            }
//
//            item {
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//        }
//    }
//}
//


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.border
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.fiap.br.ecochoice.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val defaultButtonColors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFF2E7D32),
        contentColor = Color.White
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { },
                actions = {
                    IconButton(onClick = { navController.navigate("profile") }) {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "Meu Perfil",
                            modifier = Modifier.size(70.dp),
                            tint = Color.Black
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                )
            )
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo do App",
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(100.dp))
                    .background(Color.White)
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Suas escolhas refletem no futuro.",
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 32.dp)
                )
                Spacer(modifier = Modifier.height(2.dp))
            }

            item { CardItem(navController, R.drawable.transporte, "Transporte", "transport") }
            item { CardItem(navController, R.drawable.alimentacao, "Alimentação", "food") }
            item { CardItem(navController, R.drawable.dicas, "Dicas Sustentáveis", "tips") }

            item { Spacer(modifier = Modifier.height(8.dp)) }
        }
    }
}

@Composable
fun CardItem(navController: NavController, imageRes: Int, description: String, route: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(220.dp)
            .padding(4.dp)
            .shadow(8.dp, shape = RoundedCornerShape(10.dp))
            .border(1.dp, Color.Gray, RoundedCornerShape(10.dp)),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFD7E0D7))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Image(
                painter = painterResource(id = imageRes),
                contentDescription = description,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Button(
                onClick = { navController.navigate(route) },
                shape = RoundedCornerShape(50.dp),
                modifier = Modifier
                    .width(220.dp)
                    .height(55.dp)
                    .padding(bottom = 12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2E7D32),
                    contentColor = Color.White
                )
            ) {
                Text(
                    description,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
