package com.example.javamor;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.nav_daily) {
                // Handle "每日精選" tab click
            } else if (itemId == R.id.nav_star) {
                // Handle "星標" tab click
            } else if (itemId == R.id.nav_moon) {
                // Handle "夜間模式" tab click
            } else if (itemId == R.id.nav_chat) {
                // Handle "訊息" tab click
            } else if (itemId == R.id.nav_profile) {
                // Handle "個人檔案" tab click
            }
            return true;
        });
    }
}