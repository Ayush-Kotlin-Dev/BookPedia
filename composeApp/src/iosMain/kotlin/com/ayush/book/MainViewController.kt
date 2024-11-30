package com.ayush.book

import androidx.compose.ui.window.ComposeUIViewController
import com.ayush.book.app.App
import com.ayush.book.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}