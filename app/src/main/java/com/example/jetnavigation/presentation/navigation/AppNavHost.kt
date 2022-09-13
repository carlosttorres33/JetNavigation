package com.example.jetnavigation.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.jetnavigation.presentation.navigation.FruitNavigation.FruitDetailNavigation
import com.example.jetnavigation.presentation.navigation.FruitNavigation.FruitListNavigation

@Composable
fun AppNavHost(
    startDestination: String = FruitListNavigation.route,
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        fruitGraph(
            onNavigateToFruitDetail = { fruit ->
                navController.navigate(FruitDetailNavigation.getDestination(fruit))
            },
            onNavigateBack = {
                navController.popBackStack()
            }
        )
    }
}