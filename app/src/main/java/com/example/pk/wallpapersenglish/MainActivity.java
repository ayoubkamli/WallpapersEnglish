package com.example.pk.wallpapersenglish;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends MvpAppCompatActivity  implements MainView{

    @InjectPresenter
    MainPresenter presenter;

    @BindView(R.id.btn_setWallpaper) Button btnSetWallpapers;

    @OnClick(R.id.btn_setWallpaper)
    void onClickWallpapers() {
        Log.d("RoGr","onClickWallpapers");
        presenter.setWallpapers();
    }


    @Override
    public void setWallpapers(String word) {
        Log.i("RoGr","setWallpapers");
        Toast.makeText(this,word,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        super.onCreate(savedInstanceState);
    }
}

