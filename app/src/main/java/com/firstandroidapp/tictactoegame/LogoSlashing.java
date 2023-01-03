package com.firstandroidapp.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogoSlashing extends AppCompatActivity {
Button start ,exit ,aboutDeveloper;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_slashing);

        start = findViewById(R.id.startBtn);
        aboutDeveloper = (Button)findViewById(R.id.developerIdBtn);
        exit = (Button) findViewById(R.id.exitBtn);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogoSlashing.this, MainActivity.class));
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        aboutDeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogoSlashing.this,aboutdeveloper.class));
            }
        });
    }
}