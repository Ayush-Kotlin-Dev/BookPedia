package com.ayush.book.book_pedia.presentation.book_list

import com.ayush.book.book_pedia.domain.Book

sealed class BookListAction {
    data class OnSearchQueryChanged(val query: String) : BookListAction()
    data class OnBookClick (val book: Book) : BookListAction()
    data class OnTabSelected (val index: Int) : BookListAction()
}