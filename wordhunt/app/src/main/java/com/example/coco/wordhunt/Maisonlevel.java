package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Maisonlevel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maisonlevel);
    }
    public void to_mission(View view){
        Intent intent = new Intent(Maisonlevel.this, Maisonmission.class);
        startActivity(intent);
    }

    public void backtomap(View view){
        Intent intent = new Intent(Maisonlevel.this, MapActivity.class);
        startActivity(intent);
    }
}
