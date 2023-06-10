package com.example.aquaculture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Feeding1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feeding1);
        final Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputPoolNumber = findViewById(R.id.inputPoolNumber);
                EditText inputFishWeight = findViewById(R.id.inputFishWeight);
                EditText inputPoolVolume = findViewById(R.id.inputPoolVolume);
                EditText inputTypeFeed = findViewById(R.id.inputTypeFeed);
                EditText inputAverageFishWeight = findViewById(R.id.inputAverageFishWeight);
                if(inputPoolNumber.getText().toString().length() != 0 && inputFishWeight.getText().toString().length() != 0 && inputPoolVolume.getText().toString().length() != 0 && inputTypeFeed.getText().toString().length() != 0 && inputAverageFishWeight.getText().toString().length() != 0){
                    int poolNumber = Integer.parseInt(inputPoolNumber.getText().toString());
                    int fishWeight = Integer.parseInt(inputFishWeight.getText().toString());
                    int poolVolume = Integer.parseInt(inputPoolVolume.getText().toString());
                    String typeFeed = inputTypeFeed.getText().toString();
                    int averageFishWeight = Integer.parseInt(inputAverageFishWeight.getText().toString());
                    Intent intent = new Intent(Feeding1.this, Feeding2.class);
                    intent.putExtra("poolNumber", poolNumber);
                    intent.putExtra("fishWeight", fishWeight);
                    intent.putExtra("poolVolume", poolVolume);
                    intent.putExtra("typeFeed", typeFeed);
                    intent.putExtra("averageFishWeight", averageFishWeight);
                    startActivity(intent);
                }
            }
        });
    }
}
