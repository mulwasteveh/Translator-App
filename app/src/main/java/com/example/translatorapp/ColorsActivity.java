package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    RelativeLayout main;
    ListView listView;
    List<word> NumbersList;
    customAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        //casting LinearLayout
        main = findViewById(R.id.mainlayout);

        listView = findViewById(R.id.list_view);





        NumbersList = new ArrayList<>();
        NumbersList.add(new word("Red", "Nyekundu",R.drawable.red));
        NumbersList.add(new word("Orange", "Chungwa",R.drawable.orange));
        NumbersList.add(new word("Yellow", "Manjano",R.drawable.yellow));
        NumbersList.add(new word("Pink", "Waridi",R.drawable.pink));
        NumbersList.add(new word("purple", "Zambarau",R.drawable.purple));
        NumbersList.add(new word("Brown", "Kahawia", R.drawable.brown));
        NumbersList.add(new word("Green", "Kijani kibichi", R.drawable.red));



        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }

    @Override
    protected void onStart() {

        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.Royalblue));

    }
}