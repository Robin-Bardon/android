package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MyActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView((R.layout.activity_main));
        Toolbar myToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolBar);
    }
}
