package com.example.pk.wallpapersenglish.data;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 *  DAO предоставляет интерфейс в самой базе данных и занимается
 *  манипулированием хранимыми данными класса Word.
 * */
@Dao
public interface WordDao {

    /**
     * Получить все слова
     * */
    @Query("SELECT * FROM Word")
    List<Word> getAllWord();

    /**
     * Получить 50 слов
     * */
    @Query("SELECT * FROM Word LIMIT 50")
    List<Word> getFiftyWord();

}