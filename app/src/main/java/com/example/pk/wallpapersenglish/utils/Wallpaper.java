package com.example.pk.wallpapersenglish.utils;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import com.example.pk.wallpapersenglish.R;

import java.io.IOException;

import butterknife.BindDrawable;

/**
 * Класс для работы, с бэкграундом рабочего стола
 * */
public class Wallpaper  {

    public Wallpaper(){

    }

    @BindDrawable(R.mipmap.back)
    Drawable wallpaper;


    /**
     * Усстановить background для рабочего стола
     * */
    public boolean setWallpaper(Drawable newWallpaper){

        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);

        Bitmap bitmap = ((BitmapDrawable) wallpaper).getBitmap();
        try {
            wallpaperManager.setBitmap(bitmap);
        } catch (IOException e) {

        }

        return true;
    }

}