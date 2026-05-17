package com.pdm0126.foodspot.screens.search

import androidx.lifecycle.ViewModel
import com.pdm0126.foodspot.data.repository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SearchViewModel(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _searchResults = MutableStateFlow<List<Restaurant>>(emptyList())
    val searchResults: StateFlow<List<Restaurant>> = _searchResults.asStateFlow()

    fun onQueryChanged(newQuery: String) {
        _searchQuery.value = newQuery
        executeSearch(newQuery)
    }

    private fun executeSearch(query: String) {
        if (query.isBlank()) {
            _searchResults.value = emptyList()
            return
        }
        _searchResults.value = repository.getRestaurants().filter { restaurant ->
            restaurant.name.contains(query, ignoreCase = true) ||
                    restaurant.menu.any { dish -> dish.name.contains(query, ignoreCase = true) }
        }
    }
}