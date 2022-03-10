package com.sentinels.guardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }
        Handler handler = new Handler();
        Runnable r = new Runnable() {

            private Context MainActivity;
            private Context HomeActivity;
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, com.sentinels.guardian.HomeActivity.class);
                startActivity(intent);
            }
        };
        handler.postDelayed(r,3000);
    }
}