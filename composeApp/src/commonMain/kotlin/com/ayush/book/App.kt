package com.ayush.book

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.ayush.book.book_pedia.data.network.KtorRemoteBookDataSource
import com.ayush.book.book_pedia.data.repository.DefaultBookRepository
import com.ayush.book.book_pedia.presentation.book_list.BookListScreenRoot
import com.ayush.book.book_pedia.presentation.book_list.BookListViewmodel
import com.ayush.book.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App(
    engine: HttpClientEngine
) {
    BookListScreenRoot(
        viewmodel = remember {
            BookListViewmodel(
                bookRepository = DefaultBookRepository(
                    remoteBookDataSource = KtorRemoteBookDataSource(
                        httpClient = HttpClientFactory.create(engine)
                    )
                )
            )
        },
        onBookClick = {},

        )
}