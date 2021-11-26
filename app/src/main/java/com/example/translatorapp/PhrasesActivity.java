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

public class PhrasesActivity extends AppCompatActivity {

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
        NumbersList.add(new word("Good morning", "Habari ya asubuhi",R.drawable.red));
        NumbersList.add(new word("Good Evening", "Habari ya jioni",R.drawable.orange));
        NumbersList.add(new word("Good Afternoon", "Habari ya mchana",R.drawable.yellow));
        NumbersList.add(new word("I'm happy to see you", "Nafurahia kukuona",R.drawable.pink));
        NumbersList.add(new word("I love you", "Nakupeda",R.drawable.purple));
        NumbersList.add(new word("That was my fault", "Kahawia", R.drawable.brown));



        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }

    @Override
    protected void onStart() {

        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.pink));

    }
}


/*
package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {
    RelativeLayout main;
    ListView listView;
    List<String> PhraseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //casting LinearLayout
        main = findViewById(R.id.mainlayout);

        //casting listview
        listView = findViewById(R.id.list_view);

        PhraseList = new ArrayList<>();
        PhraseList.add("Father");
        PhraseList.add("Mother");
        PhraseList.add("Come");
        PhraseList.add("Go");
        PhraseList.add("Cable");
        PhraseList.add("Adapter");
        PhraseList.add("Flower");
        PhraseList.add("Color");
        PhraseList.add("Laptop");
        PhraseList.add("Flash");
        PhraseList.add("Phone");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, PhraseList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected  " + PhraseList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.pink));
    }
}*/
