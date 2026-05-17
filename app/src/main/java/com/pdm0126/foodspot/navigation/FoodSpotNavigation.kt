package com.pdm0126.foodspot.navigation

sealed class Screen {
    object List : Screen()
    object Search : Screen()
    data class Detail(val restaurantId: Int) : Screen()
}