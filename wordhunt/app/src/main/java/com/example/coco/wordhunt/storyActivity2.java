package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class storyActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story2);
    }
    public void next(View v){
        Intent intent = new Intent(storyActivity2.this, storyActivity3.class);
        startActivity(intent);
    }
}
