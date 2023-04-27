package com.example.miproyectofinal.DAO

import androidx.room.*
import com.example.miproyectofinal.DB.Alimento
import kotlinx.coroutines.flow.Flow

@Dao
interface AlimentoDao {
    @Query("SELECT * FROM tblAlimento")
    fun getAll(): Flow<List<Alimento>>

    @Insert
    fun insertAlimento(Alimento: Alimento)

    @Update
    fun updateAlimento(Alimento: Alimento)

    @Delete
    fun deleteAlimento(Alimento: Alimento)

    @Query("DELETE FROM tblAlimento WHERE id = :id")
    fun deleteAlimento(id: Int)
}