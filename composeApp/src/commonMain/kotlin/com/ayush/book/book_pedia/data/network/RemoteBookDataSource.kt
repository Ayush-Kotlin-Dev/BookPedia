package com.ayush.book.book_pedia.data.network


import com.ayush.book.book_pedia.data.dto.SearchResponseDto
import com.ayush.book.core.domain.Result
import com.ayush.book.core.domain.DataError
interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

}