package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Maisonmission extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maisonmission);
    }

    public void toMission(View view){
        Intent intent = new Intent(Maisonmission.this, MissionA.class);
        startActivity(intent);
    }

    public void backtolevel(View view){
        Intent intent = new Intent(Maisonmission.this, Maisonlevel.class);
        startActivity(intent);
    }
}
