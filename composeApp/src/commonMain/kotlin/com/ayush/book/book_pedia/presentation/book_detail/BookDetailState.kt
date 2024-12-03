package com.ayush.book.book_pedia.presentation.book_detail

import com.ayush.book.book_pedia.domain.Book

data class BookDetailState(
    val isLoading : Boolean = true,
    val isFavorite : Boolean = false,
    val book : Book? = null
)