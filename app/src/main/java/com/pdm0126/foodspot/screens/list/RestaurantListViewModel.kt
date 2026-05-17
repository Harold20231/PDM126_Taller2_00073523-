package com.pdm0126.foodspot.screens.list

import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.repository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class RestaurantListViewModel(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _groupedRestaurants = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val groupedRestaurants: StateFlow<Map<String, List<Restaurant>>> = _groupedRestaurants.asStateFlow()

    init {
        loadRestaurantsGroupedByCategory()
    }

    private fun loadRestaurantsGroupedByCategory() {
        val allRestaurants = repository.getRestaurants()

        val dynamicGroups = mutableMapOf<String, MutableList<Restaurant>>()

        for (restaurant in allRestaurants) {
            for (category in restaurant.categories) {
                if (!dynamicGroups.containsKey(category)) {
                    dynamicGroups[category] = mutableListOf()
                }
                dynamicGroups[category]?.add(restaurant)
            }
        }

        _groupedRestaurants.value = dynamicGroups
    }
}