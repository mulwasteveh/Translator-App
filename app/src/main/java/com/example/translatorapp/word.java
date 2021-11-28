package com.example.translatorapp;

public class word {
    private String EnglishWord, KiswahiliWord;
    private int image, audio;

    public word() {
    }

    public word(String englishWord, String kiswahiliWord, int image, int audio) {
        EnglishWord = englishWord;
        KiswahiliWord = kiswahiliWord;
        this.image = image;
        this.audio = audio;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }

    public String getKiswahiliWord() {
        return KiswahiliWord;
    }

    public int getImage() {
        return image;
    }
    public int getAudio() {
        return audio;
    }

    public void setEnglishWord(String englishWord) {
        EnglishWord = englishWord;
    }

    public void setKiswahiliWord(String kiswahiliWord) {
        KiswahiliWord = kiswahiliWord;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public void setAudio(int audio) {
        this.audio = audio;
    }
}
