package com.example.latihanintentlebihlebih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void nextTiga(View view) {
        Intent nextTiga = new Intent(this, Main4Activity.class);
        startActivity(nextTiga);

    }
}
