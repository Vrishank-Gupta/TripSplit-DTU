package com.vrishankgupta.chatting;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.appus.splash.Splash;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();

        Splash.Builder splash = new Splash.Builder(this, getSupportActionBar());

        splash.setSplashImage(getResources().getDrawable(R.drawable.split));
        splash.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));


        Handler h = new Handler();


        splash.perform();
        Runnable r = new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this,LoginActivity.class));
                finish();
            }
        };
        h.postDelayed(r,3000);


    }
}
