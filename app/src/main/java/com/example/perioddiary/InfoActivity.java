package com.example.perioddiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {
    private Button backButton;
    private Button homeBtn;
    private Button InfoBtn;
    private Button settingBtn;
    private Button HygieneButton;
    private Button DietButton;
    private Button ExerciseButton;
    private Button PregnancyButton;
    private Button PMSButton;
    private Button yUserButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        backButton = (Button) findViewById(R.id.backbtn);
        homeBtn = (Button) findViewById(R.id.homebtn);
        InfoBtn = (Button) findViewById(R.id.infobtn);
        settingBtn = (Button) findViewById(R.id.settingbtn);
         HygieneButton = (Button) findViewById(R.id.hygieneBtn);
         DietButton = (Button) findViewById(R.id.dietBtn);
         ExerciseButton = (Button) findViewById(R.id.exerciseBtn);
         PregnancyButton = (Button) findViewById(R.id.pregnancyBtn);
         PMSButton = (Button) findViewById(R.id.PmsBtn);
         yUserButton = (Button) findViewById(R.id.yUserBtn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
        InfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInfoActivity();
            }
        });
        InfoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingActivity();
            }
        });
    }


    public void openHomeActivity() {
        Intent intent = new Intent(InfoActivity.this, HomeActivity.class);
        startActivity(intent);
    }
    public void openInfoActivity() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    public void openSettingActivity() {
        Intent intent = new Intent(this, SettingActivity.class);
        startActivity(intent);
    }
}