package com.example.translatorapp;

public class word {
    private String EnglishWord, KiswahiliWord;
    private int image;

    public word(){

    }

    public word(String englishWord, String kiswahiliWord, int image) {
        EnglishWord = englishWord;
        KiswahiliWord = kiswahiliWord;
        this.image = image;
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

    public void setEnglishWord(String englishWord) {
        EnglishWord = englishWord;
    }

    public void setKiswahiliWord(String kiswahiliWord) {
        KiswahiliWord = kiswahiliWord;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
