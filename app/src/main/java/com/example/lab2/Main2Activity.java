package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.TextView;

import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    TextView textview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textview2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("message");
        textview2.setText("Hello " + s);
    }
}
