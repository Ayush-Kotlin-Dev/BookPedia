package com.ayush.book.book_pedia.presentation.book_list

import com.ayush.book.book_pedia.domain.Book
import com.ayush.book.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults : List<Book> = emptyList(),
    val favoriteBooks : List<Book> = emptyList(),
    val isLoading : Boolean = true,
    val selectedTabIndex : Int = 0,
    val errorMessage : UiText? = null
)
