package com.example.kenyamamoto.anbayasiroulette;

/**
 * Created by kenyamamoto on 2016/06/20.
 */
public class AnbayasiData {
    private int number;
    private int addition;
    private String comment;
    // Constructor
    public AnbayasiData(int number, int addition, String comment) {
        this.number = number;
        this.addition = addition;
        this.comment = comment;
    }

    public int getNumber() {
        return number;
    }

    public int getAddition() {
        return addition;
    }

    public String getComment() {
        return comment;
    }
}
