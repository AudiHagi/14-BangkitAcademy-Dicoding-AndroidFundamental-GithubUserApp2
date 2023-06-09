package com.submission.dicoding.githubuser.data.local.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.submission.dicoding.githubuser.data.local.entity.UserEntity

@Database(
    entities = [UserEntity::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase? = null
        fun getInstance(context: Context): UserDatabase = INSTANCE ?: synchronized(this) {
            Room.databaseBuilder(
                context.applicationContext,
                UserDatabase::class.java,
                "Favorite_User.db"
            ).build().apply {
                INSTANCE = this
            }
        }
    }
}