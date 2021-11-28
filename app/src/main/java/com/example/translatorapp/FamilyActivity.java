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
        NumbersList.add(new word("Father", "Baba",R.drawable.father, R.raw.baba));
        NumbersList.add(new word("Mother", "Mama",R.drawable.mother, R.raw.mama));
        NumbersList.add(new word("Sister", "Dada",R.drawable.sister, R.raw.dada));
        NumbersList.add(new word("Brother", "Ndugu",R.drawable.brother, R.raw.ndugu));
        NumbersList.add(new word("Great Grand Father", "Babu Mkubwa",R.drawable.greatgrandfather, R.raw.baba));
        NumbersList.add(new word("Child", "Mtoto", R.drawable.child, R.raw.mtoto));
        NumbersList.add(new word("Sibling", "watoto", R.drawable.sibling, R.raw.mtoto));



        customAdapter = new customAdapter(this, NumbersList);
        listView.setAdapter(customAdapter);
    }

    @Override
    protected void onStart() {

        super.onStart();
        main.setBackgroundColor(getResources().getColor(R.color.orange));

    }
}
