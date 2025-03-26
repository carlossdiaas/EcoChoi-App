package com.fiap.br.ecochoice.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fiap.br.ecochoice.ui.theme.screen.FoodScreen
import com.fiap.br.ecochoice.ui.theme.screen.HomeScreen
import com.fiap.br.ecochoice.ui.theme.screen.ProfileScreen
import com.fiap.br.ecochoice.ui.theme.screen.DicasScreen
import com.fiap.br.ecochoice.ui.theme.screen.TransportScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("transport") { TransportScreen(navController) }
        composable("food") { FoodScreen(navController) }
        composable("tips") { DicasScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}
