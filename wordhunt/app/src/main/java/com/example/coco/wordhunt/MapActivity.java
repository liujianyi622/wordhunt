package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void maison(View view){
        Intent intent = new Intent(MapActivity.this, Maisonlevel.class);
        startActivity(intent);
    }
    public void marche(View view){
        Intent intent = new Intent(MapActivity.this, Marchelevel.class);
        startActivity(intent);
    }

    public void musee(View view){
        Intent intent = new Intent(MapActivity.this, Museelevel.class);
        startActivity(intent);
    }

    public void back_profil(View view){
        Intent intent = new Intent(MapActivity.this, profil.class);
        startActivity(intent);
    }

}
