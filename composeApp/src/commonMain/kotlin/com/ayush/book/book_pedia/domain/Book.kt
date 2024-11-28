package com.ayush.book.book_pedia.domain

data class Book(
    val id : String,
    val title : String,
    val imageUrl : String,
    val authors : List<String>,
    val description : String,
    val language : List<String>,
    val firstPublishYear : String? ,
    val averageRating : Double?,
    val ratingCount : Int?,
    val numPages : Int?,
    val numEditions : Int
)