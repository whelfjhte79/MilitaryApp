package com.example.militaryapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Main_Calculator_Fragment main_Calculator_Fragment;
    Main_Board_Fragment main_Board_Fragment;
    BottomNavigationView bt_navi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_Calculator_Fragment = new Main_Calculator_Fragment();
        main_Board_Fragment = new Main_Board_Fragment();
        bt_navi = findViewById(R.id.bottomNavigationView);

        getSupportFragmentManager().beginTransaction().replace(R.id.calculator_container, main_Calculator_Fragment).commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.board_container, main_Board_Fragment).commit();
    }
}
