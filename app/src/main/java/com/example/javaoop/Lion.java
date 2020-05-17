package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat implements Printable {

    public Lion() {
        Log.i("constructor", "Constructor Lion()");
    }


    public static String whatCatsLike() {
        return " I'm lion and I like playing, jumping and sometimes scratching";
    }

    @Override
    public void draw() {
        Log.i("draw()", "Draw Lion");
    }

    @Override
    public void print() {

    }
}
