package com.pdm0126.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.pdm0126.foodspot.data.repository.HardcodedRestaurantRepository
import com.pdm0126.foodspot.navigation.Screen
import com.pdm0126.foodspot.screens.detail.RestaurantDetailScreen
import com.pdm0126.foodspot.screens.detail.RestaurantDetailViewModel
import com.pdm0126.foodspot.screens.list.RestaurantListScreen
import com.pdm0126.foodspot.screens.list.RestaurantListViewModel
import com.pdm0126.foodspot.screens.search.SearchScreen
import com.pdm0126.foodspot.screens.search.SearchViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val repository = HardcodedRestaurantRepository()

        val listViewModel = RestaurantListViewModel(repository)
        val detailViewModel = RestaurantDetailViewModel(repository)
        val searchViewModel = SearchViewModel(repository)

        setContent {
            var currentScreen by remember { mutableStateOf<Screen>(Screen.List) }
            val backStack = remember { mutableStateListOf<Screen>() }

            fun navigateTo(screen: Screen) {
                backStack.add(currentScreen)
                currentScreen = screen
            }

            fun navigateBack() {
                if (backStack.isNotEmpty()) {
                    currentScreen = backStack.removeAt(backStack.size - 1)
                }
            }

            BackHandler(enabled = backStack.isNotEmpty()) {
                navigateBack()
            }

            when (val screen = currentScreen) {
                is Screen.List -> {
                    RestaurantListScreen(
                        viewModel = listViewModel,
                        onNavigateToSearch = { navigateTo(Screen.Search) },
                        onNavigateToDetail = { id -> navigateTo(Screen.Detail(id)) }
                    )
                }
                is Screen.Search -> {
                    SearchScreen(
                        viewModel = searchViewModel,
                        onNavigateBack = { navigateBack() },
                        onNavigateToDetail = { id -> navigateTo(Screen.Detail(id)) }
                    )
                }
                is Screen.Detail -> {
                    RestaurantDetailScreen(
                        restaurantId = screen.restaurantId,
                        viewModel = detailViewModel,
                        onNavigateBack = { navigateBack() }
                    )
                }
            }
        }
    }
}