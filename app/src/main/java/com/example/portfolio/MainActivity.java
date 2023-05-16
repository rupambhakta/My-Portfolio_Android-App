package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnSkill;
Button btneducation;
Button btnHobby;
Button btnAchieenement;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSkill = findViewById(R.id.btnSkill);
        btneducation = findViewById(R.id.btnEducation);
        btnHobby = findViewById(R.id.btnHobby);
        btnAchieenement = findViewById(R.id.btnAchievement);

        Intent intent;
        intent = new Intent(MainActivity.this,Skills.class);
        btnSkill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        Intent intentEducation;
        intentEducation = new Intent(MainActivity.this,education.class);
        btneducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentEducation);
            }
        });
        Intent intentHobby;
        intentHobby = new Intent(MainActivity.this,hobby.class);
        btnHobby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentHobby);
            }
        });
    Intent intentAchievement;
    intentAchievement = new Intent(MainActivity.this,achievement.class);
    btnAchieenement.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(intentAchievement);
        }
    });

    }
}