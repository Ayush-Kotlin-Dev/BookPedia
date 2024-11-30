package com.ayush.book.book_pedia.data.repository

import com.ayush.book.book_pedia.data.mappers.toBook
import com.ayush.book.book_pedia.data.network.RemoteBookDataSource
import com.ayush.book.book_pedia.domain.Book
import com.ayush.book.book_pedia.domain.BookRepository
import com.ayush.book.core.domain.DataError
import com.ayush.book.core.domain.map
import com.ayush.book.core.domain.Result


class DefaultBookRepository(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository{
    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }
}