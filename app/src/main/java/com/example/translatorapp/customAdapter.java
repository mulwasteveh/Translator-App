package com.example.translatorapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class customAdapter extends BaseAdapter{
    Context context;
    List<word>wordList;

    public customAdapter(Context context, List<word> wordList) {
        this.context = context;
        this.wordList = wordList;
    }

    @Override
    public int getCount() {
        return wordList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.mainlayout, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageview);
        TextView txtEnglish = convertView.findViewById(R.id.english);
        TextView txtKiswahili = convertView.findViewById(R.id.kiswahili);

        imageView.setImageResource(wordList.get(position).getImage());
        txtEnglish.setText(wordList.get(position).getEnglishWord().toString());
        txtKiswahili.setText(wordList.get(position).getKiswahiliWord().toString());


        return convertView;
    }
}

