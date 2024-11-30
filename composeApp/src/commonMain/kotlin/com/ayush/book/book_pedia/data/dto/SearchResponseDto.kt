package com.ayush.book.book_pedia.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SearchResponseDto(
    @SerialName("docs") val results : List<SearchedBookDto>
)