package com.athaya.myinventoryapp.ui.home

import androidx.lifecycle.ViewModel
import com.athaya.myinventoryapp.data.Item

/**
 * ViewModel to retrieve all item in the room databases.
 */
class HomeViewModel : ViewModel() {
    companion object{
        private const val TIMEOUT_MILLIS = 5_000L

    }
}

/**
 * UI State for HomeScreen
 */
data class HomeUiState(val itemList: List<Item> = listOf())