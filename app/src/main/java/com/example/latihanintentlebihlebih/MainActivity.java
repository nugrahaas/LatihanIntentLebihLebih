package com.example.latihanintentlebihlebih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void nextSatu(View view) {
        Intent nextSatu = new Intent(this, Main2Activity.class);
        startActivity(nextSatu);
    }

    public void nextDua(View view) {
        Intent nextDua = new Intent(this, Main3Activity.class);
        startActivity(nextDua);
    }

    public void nextTiga(View view) {
        Intent nextTiga = new Intent(this, Main4Activity.class);
        startActivity(nextTiga);

    }

    public void nextEmpat(View view) {
        Intent nextEmpat = new Intent(this, Main5Activity.class);
        startActivity(nextEmpat);
    }

    public void nextLima(View view) {
        Intent nextLima = new Intent(this, Main6Activity.class);
        startActivity(nextLima);
    }

    public void nextEnam(View view) {
        Intent nextEnam = new Intent(this, MainActivity.class);
        startActivity(nextEnam);
    }
}
