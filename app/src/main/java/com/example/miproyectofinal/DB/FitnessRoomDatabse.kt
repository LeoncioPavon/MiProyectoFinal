package com.example.miproyectofinal.DB

import android.content.Context
import com.example.miproyectofinal.DAO.AlimentoDao

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Alimento::class), version = 1, exportSchema = false)
public abstract class FitnessRoomDatabase : RoomDatabase() {

    abstract fun AlimentoDao(): AlimentoDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: FitnessRoomDatabase? = null

        fun getDatabase(context: Context): FitnessRoomDatabase {
            // if the INSTANCE is not null, then return it,
            // if it is, then create the database
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FitnessRoomDatabase::class.java,
                    "RoomTest"
                ).build()
                INSTANCE = instance
                // return instance
                instance
            }
        }
    }
}