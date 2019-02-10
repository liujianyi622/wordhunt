package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AnswerActivity extends AppCompatActivity {
    Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        //btn_back = (Button) findViewById(R.id.back_to_mission);
    }

    public void backtomission(View v){
        Intent intent = new Intent(AnswerActivity.this, Maisonmission.class);
        startActivity(intent);
    }
}
