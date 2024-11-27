package com.ayush.book

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform