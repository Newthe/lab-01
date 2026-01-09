package com.example.petshop;
import java.util.Date;
public class HappyMood extends Mood{
    public HappyMood() {
        super();
    }
    public HappyMood(Date date) {
        super(date);
    }
    public String getMood() {
        return "I am feeling happy!";
    }
}