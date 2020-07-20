package com.example.roomwordsample.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomwordsample.domain.Word


@Dao
interface WordRepository {

    @Query("SELECT * FROM WORD ORDER BY WORD ASC")
    fun getAllOrderByWordAsc(): List<Word>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWord(word: Word)

    @Query("DELETE FROM WORD")
    suspend fun deleteAll()
}