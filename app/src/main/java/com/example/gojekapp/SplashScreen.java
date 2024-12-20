package com.example.gojekapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        // cek apakah username itu exist
        SharedPreferences sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        String username = sharedPreferences.getString("username", "Default Name");

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                // Code to execute after delay
                if (username.equals("Default Name")){
                    Intent in =new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(in);
                }else{
                    Intent in =new Intent(SplashScreen.this, Calculator.class);
                    startActivity(in);
                }
            }
        }, 1000);



    }
}