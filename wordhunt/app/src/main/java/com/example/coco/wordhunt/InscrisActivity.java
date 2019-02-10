package com.example.coco.wordhunt;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class InscrisActivity extends AppCompatActivity {
    private MyDatabaseHelper dbHelper;
    Button btn_inscris_ok;
    TextView nom, pwd, age;
    RadioButton sexe;
    RadioGroup sexegroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscris);
        btn_inscris_ok = (Button) findViewById(R.id.rejoins);
        nom = (TextView)findViewById(R.id.nom);
        pwd = (TextView)findViewById(R.id.pwd);
        age = (TextView)findViewById(R.id.age);
        sexegroup = (RadioGroup)findViewById(R.id.sexegroup);
        sexe = (RadioButton)findViewById(sexegroup.getCheckedRadioButtonId());


        btn_inscris_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*String nominput = nom.getText().toString().trim();
                String pwdinput = pwd.getText().toString().trim();
                String ageinput = age.getText().toString().trim();
                String sexeinput = (String) sexe.getText();

                User user = new User();
                user.setUser_name(nominput);
                user.setPassword(pwdinput);
                user.setAge(ageinput);
                user.setSexe(sexeinput);
                int result=sqliteDB.getInstance(getApplicationContext()).saveuser(user);
                if(nominput.equals("") || pwdinput.equals("") || ageinput.equals("")){
                    AlertDialog.Builder alertdialogbuilder=new AlertDialog.Builder(InscrisActivity.this);
                    alertdialogbuilder.setMessage("Merci d'indiquez tous les informations.");
                    alertdialogbuilder.setNegativeButton("D'accord", click2);
                    AlertDialog alertdialog1=alertdialogbuilder.create();
                    alertdialog1.show();
                }else {
                    if (result == 1) {*/
                        Intent intent = new Intent(InscrisActivity.this, MainActivity.class);
                        startActivity(intent);
                   /* } else if (result == -1) {
                        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(InscrisActivity.this);
                        alertdialogbuilder.setMessage("Le nom été déjà exist.");
                        alertdialogbuilder.setNegativeButton("D'accord", click1);
                        AlertDialog alertdialog1 = alertdialogbuilder.create();
                        alertdialog1.show();
                    }*/
                }



        });




            }
    /*private DialogInterface.OnClickListener click1=new DialogInterface.OnClickListener()
    {
        @Override

        public void onClick(DialogInterface arg0,int arg1)
        {
            arg0.cancel();
        }
    };
    private DialogInterface.OnClickListener click2=new DialogInterface.OnClickListener()
    {
        @Override

        public void onClick(DialogInterface arg0,int arg1)
        {
            arg0.cancel();
        }
    };*/



    }


