package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class wordlist extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wordlist);
    }

    public void backprofil(View view){
        Intent intent = new Intent(wordlist.this, profil.class);
        startActivity(intent);
    }
}
