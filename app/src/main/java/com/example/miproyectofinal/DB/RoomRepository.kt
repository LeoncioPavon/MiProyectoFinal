package com.example.miproyectofinal.DB

import androidx.annotation.WorkerThread
import com.example.miproyectofinal.DAO.AlimentoDao
import kotlinx.coroutines.flow.Flow

class RoomRepository private constructor(private val dao: AlimentoDao) {

    val Alimento: Flow<List<Alimento>> = dao.getAll()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(Alimento: Alimento) {
        dao.insertAlimento(Alimento)
    }

    companion object {
        private var INSTANCE: RoomRepository? = null

        fun init(dao: AlimentoDao): RoomRepository {
            if (INSTANCE != null) return INSTANCE!!
            INSTANCE = RoomRepository(dao)
            return INSTANCE!!
        }

        fun getInstance(): RoomRepository {
            return INSTANCE!!
        }
    }
}