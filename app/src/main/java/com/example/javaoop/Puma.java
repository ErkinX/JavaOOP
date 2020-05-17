package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat implements Movable,Printable {

    private  String pumaHelloText;


    @Override
    public void draw() {
        Log.i("draw()", "Draw puma");
    }

    @Override
    public void move() {
        Log.i("move()", "Move overridden puma");
    }

    @Override
    public void print() {
        Log.i("print()", "Print puma");
    }
}
