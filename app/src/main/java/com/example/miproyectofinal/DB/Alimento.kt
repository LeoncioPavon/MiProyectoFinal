package com.example.miproyectofinal.DB

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("tblAlimento")
data class Alimento(
    @PrimaryKey(true)
    val id: Int,
    @ColumnInfo("nombre")
    var nombre: String,
    @ColumnInfo("tipo")
    var tipo: String,
    @ColumnInfo("cantidad")
    var cantidad: Int,
    @ColumnInfo("calorias")
    var calorias: Int
)