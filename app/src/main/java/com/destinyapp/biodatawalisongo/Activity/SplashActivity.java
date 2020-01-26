package com.destinyapp.biodatawalisongo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.destinyapp.biodatawalisongo.R;

public class SplashActivity extends AppCompatActivity {
    MediaPlayer SuaraLagu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler();
        SuaraLagu = MediaPlayer.create(SplashActivity.this,R.raw.selamatdatang);
        SuaraLagu.start();
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
            }
        }, 5000); //3000
    }

    private void changeActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        finishAffinity();
        startActivity(intent);
    }
}
