package com.ayush.book.book_pedia.data.dto

import kotlinx.serialization.Serializable

@Serializable()
data class BookWorkDto(
    val description : String? = null,
)