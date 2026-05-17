package com.pdm0126.foodspot.data.repository
import com.pdm0126.foodspot.model.Restaurant

interface RestaurantRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
}