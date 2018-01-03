package com.example.pk.wallpapersenglish;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;


@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    public MainPresenter() {
        Log.d("RoGr","MainPresenter()");
    }

    public void setWallpapers() {
        Log.d("RoGr","setWallpapers()");
        getViewState().setWallpapers("123");
    }
}

