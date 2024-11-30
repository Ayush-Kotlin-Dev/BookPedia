package com.ayush.book

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.ayush.book.app.App
import com.ayush.book.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "BookPedia",
        ) {
            App()
        }
    }
}