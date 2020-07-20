package com.example.roomwordsample.repository

import androidx.lifecycle.LiveData
import com.example.roomwordsample.domain.Word

class WordRepository(private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAllOrderByWordAsc()

    suspend fun insert(word: Word) {
        wordDao.insertWord(word)
    }
}