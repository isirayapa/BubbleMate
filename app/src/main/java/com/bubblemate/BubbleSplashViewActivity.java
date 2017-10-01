package com.bubblemate;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BubbleSplashViewActivity extends AppCompatActivity {

    private int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                ///////// When the login implements this has to be changed
                Intent intent = new Intent(BubbleSplashViewActivity.this,BubbleLoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.splsh_fade_in,R.anim.splash_fade_out);

            }
        },SPLASH_TIME_OUT);
    }
}
