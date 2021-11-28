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
        NumbersList.add(new word("One", "Moja",R.drawable.father, R.raw.moja));
        NumbersList.add(new word("Two", "Mbili",R.drawable.mother, R.raw.mbili));
        NumbersList.add(new word("Three", "Tatu",R.drawable.sister, R.raw.tatu));
        NumbersList.add(new word("Four", "Nne",R.drawable.brother, R.raw.nne));
        NumbersList.add(new word("Five", "Tano",R.drawable.greatgrandfather, R.raw.tano));
        NumbersList.add(new word("Six", "Sita", R.drawable.child, R.raw.sita));
        NumbersList.add(new word("Seven", "Saba", R.drawable.sibling, R.raw.saba));
        NumbersList.add(new word("Eight", "Nane", R.drawable.sibling, R.raw.nane));
        NumbersList.add(new word("Nine", "Tisa", R.drawable.sibling, R.raw.tisa));
        NumbersList.add(new word("Ten", "Kumi", R.drawable.sibling, R.raw.kumi));





        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }
}