package com.android.foundspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();
    //  new Handler().postDelayed(this::navigateToMain, 3000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {navigate();}
        }, 3000);
    }
    void navigate(){
    //  startActivity(new Intent(this, SingInActivity.class));
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
    }
}
