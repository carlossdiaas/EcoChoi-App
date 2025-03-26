package com.fiap.br.ecochoice.data


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL



import android.util.Log

object FoodApiService {
    suspend fun getFoodInfo(barcode: String): FoodProduct? {
        return withContext(Dispatchers.IO) {
            try {
                Log.d("FoodApiService", "Iniciando busca para o código de barras: $barcode") // Log

                val url = URL("https://world.openfoodfacts.org/api/v2/product/$barcode.json")
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"

                Log.d("FoodApiService", "Código de resposta HTTP: ${connection.responseCode}") // Log

                if (connection.responseCode == HttpURLConnection.HTTP_OK) {
                    val response = connection.inputStream.bufferedReader().use { it.readText() }
                    Log.d("FoodApiService", "Resposta JSON: $response") // Log

                    val json = JSONObject(response)
                    val product = json.optJSONObject("product")

                    if (product == null) {
                        Log.w("FoodApiService", "Produto não encontrado para o código de barras: $barcode") // Log
                        return@withContext null
                    }

                    val name = product.optString("product_name", "Nome não encontrado")
                    val brand = product.optString("brands", null)
                    val imageUrl = product.optString("image_url", null)
                    val carbonFootprint = product.optString("carbon-footprint-from-meat_or_fish", "Não disponível")

                    Log.d("FoodApiService", "Nome: $name, Marca: $brand, Imagem: $imageUrl, Carbono: $carbonFootprint")

                    FoodProduct(
                        name = name,
                        brand = brand,
                        imageUrl = imageUrl,
                        carbonFootprint = carbonFootprint
                    )
                } else {
                    Log.e("FoodApiService", "Erro na requisição HTTP: ${connection.responseMessage}") // Log
                    null
                }
            } catch (e: Exception) {
                Log.e("FoodApiService", "Erro ao buscar informações do produto: ${e.message}", e) // Log
                null
            }
        }
    }
}