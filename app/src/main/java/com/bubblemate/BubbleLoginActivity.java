package com.bubblemate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BubbleLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_login);
    }


    public void Login(View view){
        Intent intent = new Intent(BubbleLoginActivity.this,BubbleDashBoardActivity.class);
        startActivity(intent);
    }
}
