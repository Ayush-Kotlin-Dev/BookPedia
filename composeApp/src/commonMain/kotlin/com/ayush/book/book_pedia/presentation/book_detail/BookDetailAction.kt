package com.ayush.book.book_pedia.presentation.book_detail

import com.ayush.book.book_pedia.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick : BookDetailAction
    data object OnFavoriteClick : BookDetailAction
    data class OnSelectedBookChange (val book: Book) : BookDetailAction

}