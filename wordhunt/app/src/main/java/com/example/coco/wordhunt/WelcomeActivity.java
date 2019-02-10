package com.example.coco.wordhunt;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    Button btn_continuer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        /*dbHelper = new MyDatabaseHelper(this, "wordhuntdemo",null,1);
        dbHelper.getWritableDatabase();
        System.out.println("数据库创建成功");*/
        btn_continuer = (Button)findViewById(R.id.continuer);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
        //init();
    }

    public void continuer(View v){
        /*SharedPreferences preferences = getSharedPreferences("count",MODE_WORLD_READABLE);
        final int count = preferences.getInt("count", 0);
        if(count == 0){
            Intent intent = new Intent(WelcomeActivity.this, storyActivity1.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(intent);
            }*/
        Intent intent = new Intent(WelcomeActivity.this, storyActivity1.class);
        startActivity(intent);
    }

    /*private void init(){
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        };
        timer.schedule(timerTask,2000);
    }*/
}
