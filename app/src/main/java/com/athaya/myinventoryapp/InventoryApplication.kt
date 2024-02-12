package com.athaya.myinventoryapp

import android.app.Application
import com.athaya.myinventoryapp.data.AppContainer
import com.athaya.myinventoryapp.data.AppDataContainer

class InventoryApplication: Application() {

    /**
     * AppContainer instance used by the rest of classes toobtain depedencies
     */
    lateinit var container : AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}