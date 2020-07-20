package com.example.roomwordsample.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomwordsample.domain.Word


@Dao
interface WordDao {

    @Query("SELECT * FROM WORD ORDER BY WORD ASC")
    fun getAllOrderByWordAsc(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertWord(word: Word)

    @Query("DELETE FROM WORD")
    suspend fun deleteAll()
}