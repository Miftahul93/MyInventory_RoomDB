package com.athaya.myinventoryapp.ui.item

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * ViewModel to retrieve, update and delete an item from the [ ItemRepository ]'s data source.
 */
class ItemDetailsViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {

    private val itemId: Int = checkNotNull(savedStateHandle[ItemDetailDestination.itemIdArg])

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
}

/**
 * UI state for ItemDetailScreen
 */
data class ItemDetailsUiState(
    val outOfStock: Boolean = true,
    val itemDetails: ItemDetails = ItemDetails()
)