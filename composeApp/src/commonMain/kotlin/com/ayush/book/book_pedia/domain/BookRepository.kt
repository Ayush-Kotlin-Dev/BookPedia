package com.ayush.book.book_pedia.domain


import com.ayush.book.core.domain.DataError
import com.ayush.book.core.domain.EmptyResult
import kotlinx.coroutines.flow.Flow
import com.ayush.book.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
//    suspend fun getBookDescription(bookId: String): Result<String?, DataError>
//
//    fun getFavoriteBooks(): Flow<List<Book>>
//    fun isBookFavorite(id: String): Flow<Boolean>
//    suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local>
//    suspend fun deleteFromFavorites(id: String)
}