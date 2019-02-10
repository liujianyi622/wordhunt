package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MissionA extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
    }
    public void backtomission(View v){
        Intent intent = new Intent(MissionA.this, Missiondemo.class);
        startActivity(intent);

    }

    public void toTakePhoto(View v){
        Intent intent = new Intent(MissionA.this, TakePhoto.class);
        startActivity(intent);
        System.out.println("任务a");
    }
}
