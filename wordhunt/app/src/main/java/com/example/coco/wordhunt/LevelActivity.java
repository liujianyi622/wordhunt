package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends AppCompatActivity {
    Button btn_level1, btn_level2, btn_level3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leveldemo);
        System.out.println("到");
        btn_level1 = (Button)findViewById(R.id.level1);
        btn_level2 = (Button)findViewById(R.id.level2);
        btn_level3 = (Button)findViewById(R.id.level3);
    }

    public void toMission(View v){
        Intent intent = new Intent(LevelActivity.this, Missiondemo.class);
        startActivity(intent);
    }

    public void backTomap(View v){
        Intent intent = new Intent(LevelActivity.this, MapActivity.class);
        startActivity(intent);
    }
}
