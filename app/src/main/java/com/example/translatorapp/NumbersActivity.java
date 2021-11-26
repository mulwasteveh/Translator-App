package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    ListView listView;
    List<word> NumbersList;
    customAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        listView = findViewById(R.id.list_view);





        NumbersList = new ArrayList<>();
        NumbersList.add(new word("One", "Moja",R.drawable.father));
        NumbersList.add(new word("Two", "Mbili",R.drawable.mother));
        NumbersList.add(new word("Three", "Tatu",R.drawable.sister));
        NumbersList.add(new word("Four", "Nne",R.drawable.brother));
        NumbersList.add(new word("Five", "Tano",R.drawable.greatgrandfather));
        NumbersList.add(new word("Six", "Sita", R.drawable.child));
        NumbersList.add(new word("Seven", "Saba", R.drawable.sibling));



        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }
}