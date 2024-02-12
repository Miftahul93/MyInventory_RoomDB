package com.athaya.myinventoryapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.athaya.myinventoryapp.ui.home.HomeDestination
import com.athaya.myinventoryapp.ui.home.HomeScreen
import com.athaya.myinventoryapp.ui.item.ItemDetailDestination
import com.athaya.myinventoryapp.ui.item.ItemDetailScreen
import com.athaya.myinventoryapp.ui.item.ItemEditDestination
import com.athaya.myinventoryapp.ui.item.ItemEditScreen
import com.athaya.myinventoryapp.ui.item.ItemEntryDestination
import com.athaya.myinventoryapp.ui.item.ItemEntryScreen

/**
 * Provides Navigation graph for the application
 */
@Composable
fun InventoryNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = HomeDestination.route,
        modifier = modifier
    ) {
        composable(route = HomeDestination.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(ItemEntryDestination.route) },
                navigateToItemUpdate = { navController.navigate("${ItemDetailDestination.route}/${it}") }
            )
        }
        composable(route = ItemEntryDestination.route) {
            ItemEntryScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() }
            )
        }
        composable(
            route = ItemDetailDestination.routeWithArgs,
            arguments = listOf(navArgument(ItemDetailDestination.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            ItemDetailScreen(
                navigateToEditItem = { navController.navigate("${ItemEditDestination.route}/$it") },
                navigateBack = { navController.navigateUp() })
        }
        composable(
            route = ItemEditDestination.routeWithArgs,
            arguments = listOf(navArgument(ItemEditDestination.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            ItemEditScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() })
        }
    }
}