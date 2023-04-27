package com.example.miproyectofinal.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("tblEjercicio")
data class Ejercicio(
    @PrimaryKey(true)
    val id: Int,
    @ColumnInfo("nombre")
    var nombre: String,
    @ColumnInfo("tipo")
    var tipo: String,
    @ColumnInfo("cantidadSeries")
    var cantidadSeries: Int,
    @ColumnInfo("cantidadRepeteciones")
    var cantidadRepeticiones: Int,
    @ColumnInfo("calorias")
    var calorias: Int
)