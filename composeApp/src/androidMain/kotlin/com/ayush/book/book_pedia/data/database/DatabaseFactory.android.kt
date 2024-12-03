package com.ayush.book.book_pedia.data.database

import android.content.Context
import androidx.room.RoomDatabase

actual class DatabaseFactory(
    private val context : Context
) {
    actual fun create(): RoomDatabase.Builder<FavoriteBookDatabase> {
        val appContext = context.applicationContext
        val dbFile = appContext.getDatabasePath(FavoriteBookDatabase.DB_NAME)

        return androidx.room.Room.databaseBuilder(
            context = appContext,
            name = dbFile.absolutePath,
        )
    }
}