package com.ayush.book.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.ayush.book.book_pedia.data.database.DatabaseFactory
import com.ayush.book.book_pedia.data.database.FavoriteBookDatabase
import com.ayush.book.book_pedia.data.network.KtorRemoteBookDataSource
import com.ayush.book.book_pedia.data.network.RemoteBookDataSource
import com.ayush.book.book_pedia.data.repository.DefaultBookRepository
import com.ayush.book.book_pedia.domain.BookRepository
import com.ayush.book.book_pedia.presentation.SelectedBookViewModel
import com.ayush.book.book_pedia.presentation.book_detail.BookDetailViewModel
import com.ayush.book.book_pedia.presentation.book_list.BookListViewmodel
import com.ayush.book.core.data.HttpClientFactory
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    single {
        HttpClientFactory.create(get())
    }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
         get<DatabaseFactory>().create()
             .setDriver(BundledSQLiteDriver())
             .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }
    viewModelOf(::BookListViewmodel)
    viewModelOf(::SelectedBookViewModel)
    viewModelOf(::BookDetailViewModel)

}