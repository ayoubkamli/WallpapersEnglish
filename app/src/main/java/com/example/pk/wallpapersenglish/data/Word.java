package com.example.pk.wallpapersenglish.data;

import android.arch.persistence.room.Entity;

@Entity
public class Word {
    String strText;//Текст
    String strComplexity;//Сложность слов
    int iPriority;//Приоритет показа
    Boolean bView;//Показывали ли мы это слово или нет
}