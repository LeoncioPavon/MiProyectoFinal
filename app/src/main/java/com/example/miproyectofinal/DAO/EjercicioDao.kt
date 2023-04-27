package com.example.miproyectofinal.DAO

import androidx.room.*
import com.example.miproyectofinal.DB.Ejercicio
import kotlinx.coroutines.flow.Flow

@Dao
interface EjercicioDao {
    @Query("SELECT * FROM tbljercicio")
    fun getAll(): Flow<List<Ejercicio>>

    @Insert
    fun insertEjercicio(Ejercicio: Ejercicio)

    @Update
    fun updateEjercicio(Ejercicio: Ejercicio)

    @Delete
    fun deleteEjercicio(Ejercicio: Ejercicio)

    @Query("DELETE FROM tblCiudad WHERE id = :id")
    fun deleteEjercicio(id: Int)
}