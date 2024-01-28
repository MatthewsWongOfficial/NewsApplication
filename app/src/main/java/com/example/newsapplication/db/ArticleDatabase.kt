package com.example.newsapplication.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.newsapplication.models.Article

@Database(
    entities = [Article::class],
    version = 2,
)

@TypeConverters(Converters::class)

abstract class ArticleDatabase : RoomDatabase() {
    abstract fun getArticlesDao(): ArticleDao

    companion object {
        private var instance: ArticleDatabase? = null
        private val LOCK = Any() // only a single instance of database at once

        // create instance of Article Database class
        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ArticleDatabase::class.java,
                "article_db.db"
            ).fallbackToDestructiveMigration().build()

    }
}
