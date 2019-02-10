package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class storyActivity3 extends AppCompatActivity {
    TextView text31, text32, text33, text34, text35;
    Button btn1, btn2, btn3, btn4, btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story3);
        text31 = (TextView) findViewById(R.id.story31);
        text32 = (TextView) findViewById(R.id.story32);
        text33 = (TextView) findViewById(R.id.story33);
        text34 = (TextView) findViewById(R.id.story34);
        text35 = (TextView) findViewById(R.id.story35);
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
    }
    public void ensuite1(View v){
        text31.setVisibility(View.INVISIBLE);
        text32.setVisibility(View.VISIBLE);
        text33.setVisibility(View.INVISIBLE);
        text34.setVisibility(View.INVISIBLE);
        text35.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
    }

    public void ensuite2(View v){
        text31.setVisibility(View.INVISIBLE);
        text32.setVisibility(View.INVISIBLE);
        text33.setVisibility(View.VISIBLE);
        text34.setVisibility(View.INVISIBLE);
        text35.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
    }

    public void ensuite3(View v){
        text31.setVisibility(View.INVISIBLE);
        text32.setVisibility(View.INVISIBLE);
        text33.setVisibility(View.INVISIBLE);
        text34.setVisibility(View.VISIBLE);
        text35.setVisibility(View.INVISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.INVISIBLE);
    }

    public void ensuite4(View v){
        text31.setVisibility(View.INVISIBLE);
        text32.setVisibility(View.INVISIBLE);
        text33.setVisibility(View.INVISIBLE);
        text34.setVisibility(View.INVISIBLE);
        text35.setVisibility(View.VISIBLE);
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.VISIBLE);
    }

    public void to_map(View v){
        Intent intent = new Intent(storyActivity3.this, MainActivity.class);
        startActivity(intent);
    }
}
