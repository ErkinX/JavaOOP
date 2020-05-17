package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Printable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat = new Lion();
        cat.talk();

        Printable printable = new Puma();
        printable.print();
        ((Puma) printable).move();

        Puma puma = new Puma();
        Log.i("speedOfMoving","" + puma.speedOfMoving);

        Log.i("speedOfMoving","" + ((Puma)printable).speedOfMoving);

        Log.i("speedOfMoving","" + Movable.speedOfMoving);


    }

    void printAnyObject(Printable printable) {

    }

    void printAnyObject(Puma puma) {

    }

    @Override
    public void print() {

    }
}
