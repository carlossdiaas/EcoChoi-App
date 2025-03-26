package com.fiap.br.ecochoice.data

data class Dica(
    val category: String,  // Ex: "Transporte", "Alimentação", "Consumo"
    val text: String
)

// Lista de dicas sustentáveis
val dicasList = listOf(
    Dica("Transporte", "Prefira bicicleta ou transporte público para reduzir emissões de CO₂."),
    Dica("Transporte", "Se precisar dirigir, tente compartilhar caronas."),
    Dica("Alimentação", "Reduza o consumo de carne para diminuir a pegada de carbono."),
    Dica("Alimentação", "Compre alimentos orgânicos e de produtores locais."),
    Dica("Consumo", "Evite plásticos descartáveis e use garrafas reutilizáveis."),
    Dica("Consumo", "Diminua o desperdício de energia desligando aparelhos em standby."),
)
