package com.example.latihanintentlebihlebih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void nextLima(View view) {
        Intent nextLima = new Intent(this, Main6Activity.class);
        startActivity(nextLima);
    }
}
