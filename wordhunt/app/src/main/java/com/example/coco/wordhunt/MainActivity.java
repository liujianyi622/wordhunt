package com.example.coco.wordhunt;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AlertDialog;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends Activity {
    private MyDatabaseHelper dbHelper;
    Button btn_connect, btn_inscris;
    TextView nom, pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_inscris = (Button) findViewById(R.id.inscris);
        btn_connect = (Button) findViewById(R.id.connect);
        nom = (TextView)findViewById(R.id.nom);
        pwd = (TextView)findViewById(R.id.pwd);

        SharedPreferences preferences = getSharedPreferences("count",MODE_WORLD_READABLE);
        final int count = preferences.getInt("count", 0);

        btn_inscris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InscrisActivity.class);
                startActivity(intent);
            }
        });

        btn_connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameinput=nom.getText().toString().trim();
                String passinput=pwd.getText().toString().trim();
                int result=sqliteDB.getInstance(getApplicationContext()).Quer(passinput,nameinput);
                //if(result == 1){
                    /*if(count == 0){
                        Intent intent = new Intent(MainActivity.this, storyActivity1.class);
                        startActivity(intent);
                    }
                    else {*/
                        Intent intent = new Intent(MainActivity.this, profil.class);
                        startActivity(intent);
                    //}

                /*}else {
                    AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(MainActivity.this);
                    alertdialogbuilder.setMessage("Le nom ou le mot de passe est incorrect.");
                    alertdialogbuilder.setNegativeButton("D'accord", click1);
                    AlertDialog alertdialog1=alertdialogbuilder.create();
                    alertdialog1.show();
                }*/
            }
        });
    }
    private DialogInterface.OnClickListener click1=new DialogInterface.OnClickListener()
    {@Override

    public void onClick(DialogInterface arg0,int arg1)
    {
        arg0.cancel();
    }
    };
}
