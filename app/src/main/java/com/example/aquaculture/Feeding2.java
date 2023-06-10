package com.example.aquaculture;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Feeding2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feeding2);
        Bundle arguments = getIntent().getExtras();
        int poolNumber = arguments.getInt("poolNumber");
        int fishWeight = arguments.getInt("fishWeight");
        int poolVolume = arguments.getInt("poolVolume");
        String typeFeed = arguments.getString("typeFeed");
        int averageFishWeight = arguments.getInt("averageFishWeight");
    }
}
