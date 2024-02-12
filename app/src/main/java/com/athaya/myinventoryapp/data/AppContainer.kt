package com.athaya.myinventoryapp.data

import android.content.Context

/**
 * AppContainer for dependency Injection
 */
interface AppContainer {
    val itemsRepository: ItemsRepository
}

/**
 * [AppContainer] implementation that provides instance of [ OfflineItemsRepository ]
 */
class AppDataContainer(private val context: Context) : AppContainer {
    /**
     * Implementation for [ ItemsRepository ]
     */
    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository()
    }
}