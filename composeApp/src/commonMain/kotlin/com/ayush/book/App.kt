package com.ayush.book

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ayush.book.book_pedia.presentation.book_list.BookListScreenRoot
import com.ayush.book.book_pedia.presentation.book_list.BookListViewmodel
import com.ayush.book.book_pedia.presentation.book_list.components.BookSearchBar
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    BookListScreenRoot(
        viewmodel = remember { BookListViewmodel() },
        onBookClick = {},

    )
}