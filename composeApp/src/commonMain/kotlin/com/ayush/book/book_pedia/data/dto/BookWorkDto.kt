package com.ayush.book.book_pedia.data.dto

import com.ayush.book.book_pedia.domain.Book
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable()
data class BookWorkDto(
    val description : String? = null,
)