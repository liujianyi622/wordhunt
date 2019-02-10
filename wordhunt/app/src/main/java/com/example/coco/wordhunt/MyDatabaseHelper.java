package com.example.coco.wordhunt;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    private  final static String DB_NAME = "wordhunt1.db";
    private Context mContext;
    public static final String CREATE_USER = "create table User("+
            "user_id integer primary key autoincrement,"+
            "user_name    TEXT NOT NULL ," +
            "sexe         TEXT NOT NULL ," +
            "age          INTEGER NOT NULL," +
            "password         TEXT NOT NULL)";
    public  MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_USER);
        Toast.makeText(mContext, "Create succeeded", Toast.LENGTH_SHORT).show();
    }


    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }



}
