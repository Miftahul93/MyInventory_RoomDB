package com.athaya.myinventoryapp.data

/**
 * Entity data class represent a single row in the database.
 */
class Item(
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)