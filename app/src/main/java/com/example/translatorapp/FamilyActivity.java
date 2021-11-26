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

public class FamilyActivity extends AppCompatActivity {

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
        NumbersList.add(new word("Father", "Baba",R.drawable.father));
        NumbersList.add(new word("Mother", "Mama",R.drawable.mother));
        NumbersList.add(new word("Sister", "Dada",R.drawable.sister));
        NumbersList.add(new word("Brother", "Ndugu",R.drawable.brother));
        NumbersList.add(new word("Great Grand Father", "Babu Mkubwa",R.drawable.greatgrandfather));
        NumbersList.add(new word("Child", "Mtoto", R.drawable.child));
        NumbersList.add(new word("Sibling", "watoto", R.drawable.sibling));



        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }

    @Override
    protected void onStart() {

        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.orange));

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

public class FamilyActivity extends AppCompatActivity {

    RelativeLayout main;
    ListView listView;
    List<String> FamilyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        //casting LinearLayout
        main = findViewById(R.id.mainlayout);

        //casting listview
        listView = findViewById(R.id.list_view);

        FamilyList = new ArrayList<>();
        FamilyList.add("Father");
        FamilyList.add("Mother");
        FamilyList.add("Brother");
        FamilyList.add("Sister");
        FamilyList.add("Cousin");
        FamilyList.add("Nephew");
        FamilyList.add("Niece");
        FamilyList.add("Grand Father");
        FamilyList.add("Grand Mother");
        FamilyList.add("Great Grand Father");
        FamilyList.add("Great Grand Mother");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, FamilyList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected  " + FamilyList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onStart() {

        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.orange));

    }
}*/
