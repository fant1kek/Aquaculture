package com.example.aquaculture;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    Button btnMainMenu;
    Button btnFeeding;
    Button btnMovingFish;
    Button btnHydrochemistry;
    Button btnFeeds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        btnMainMenu = (Button)findViewById(R.id.btnMainMenu);
        btnFeeding = (Button)findViewById(R.id.btnFeeding);
        btnMovingFish = (Button)findViewById(R.id.btnMovingFish);
        btnHydrochemistry = (Button)findViewById(R.id.btnHydrochemistry);
        btnFeeds = (Button)findViewById(R.id.btnFeeds);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                switch (view.getId()) {
                    /*case R.id.btnMainMenu:
                        intent = new Intent(Menu.this, MainMenu.class);
                        break;*/
                    case R.id.btnFeeding:
                        intent = new Intent(Menu.this, Feeding1.class);
                        break;
                    /*case R.id.btnMovingFish:
                        intent = new Intent(Menu.this, MovingFish.class);
                        break;
                    case R.id.btnHydrochemistry:
                        intent = new Intent(Menu.this, Hydrochemistry.class);
                        break;
                    case R.id.btnFeeds:
                        intent = new Intent(Menu.this, Feeds.class);
                        break;*/
                }
                startActivity(intent);
            }
        };

        btnMainMenu.setOnClickListener(onClickListener);
        btnFeeding.setOnClickListener(onClickListener);
        btnMovingFish.setOnClickListener(onClickListener);
        btnHydrochemistry.setOnClickListener(onClickListener);
        btnFeeds.setOnClickListener(onClickListener);

    }
}