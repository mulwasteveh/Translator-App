package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnFamily, btnNumbers, btnColors, btnPhrases;

    LinearLayout main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFamily = findViewById(R.id.family);
        btnNumbers = findViewById(R.id.numbers);
        btnColors = findViewById(R.id.colors);
        btnPhrases = findViewById(R.id.phrases);

        //casting LinearLayout
        main = findViewById(R.id.mainlayout);


    }


    public void NUMBER(View view) {
        Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(intent);
    }

    public void FAMILY(View view) {
        Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(intent);
    }


    public void COLORS(View view) {
        Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(intent);
    }

    public void PHRASES(View view) {
        Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(intent);
    }
}