package com.example.coco.wordhunt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class profil extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void to_map(View view){
        Intent intent = new Intent(profil.this, MapActivity.class);
        startActivity(intent);
    }

    public void deconnecter(View view){
        Intent intent = new Intent(profil.this, MainActivity.class);
        startActivity(intent);
    }

    public void to_liste(View view){
        Intent intent = new Intent(profil.this, wordlist.class);
        startActivity(intent);
    }
}
