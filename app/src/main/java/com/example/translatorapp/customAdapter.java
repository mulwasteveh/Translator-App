package com.example.translatorapp;

import android.content.Context;
import android.media.MediaPlayer;
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
    MediaPlayer music;

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
        ImageView imageView1 = convertView.findViewById(R.id.playbtn);

        imageView.setImageResource(wordList.get(position).getImage());
        txtEnglish.setText(wordList.get(position).getEnglishWord().toString());
        txtKiswahili.setText(wordList.get(position).getKiswahiliWord().toString());
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music = MediaPlayer.create(context, wordList.get(position).getAudio());
                music.start();
            }
        });


        return convertView;
    }
}

