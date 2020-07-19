package com.example.roomwordsample.domain

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "WORD")
data class Word(

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @ColumnInfo(name = "WORD")
    val word: String
)