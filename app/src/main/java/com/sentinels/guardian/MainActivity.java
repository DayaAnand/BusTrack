package com.sentinels.guardian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(getApplicationContext(),SignInActivity.class);
        startActivity(intent);
        finish();
        Log.d("Is user ?", String.valueOf(FirebaseAuth.getInstance().getCurrentUser()));
//        if(FirebaseAuth.getInstance().getCurrentUser()==null){
//            Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
//            startActivity(intent);
//            finish();
//        }
    }
}