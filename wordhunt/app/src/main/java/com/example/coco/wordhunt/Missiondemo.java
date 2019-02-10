package com.example.coco.wordhunt;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Missiondemo extends Activity {
    private Button btn_mission1,btn_mission2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.missiondemo);
    }

    public void toMissionpage(View view){
        Intent intent = new Intent(Missiondemo.this, MissionA.class);
        startActivity(intent);
    }

    public void backTolevel(View v){
        Intent intent = new Intent(Missiondemo.this, LevelActivity.class);
        startActivity(intent);
    }
}
