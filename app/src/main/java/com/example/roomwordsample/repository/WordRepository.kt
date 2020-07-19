package com.example.roomwordsample.repository

import androidx.room.Dao
import androidx.room.Query
import com.example.roomwordsample.domain.Word


@Dao
interface WordRepository {

    @Query(value = "SELECT * FROM WORD ORDER BY WORD ASC")
    fun getAllOrderByWordAsc(): List<Word>
}