package com.example.coco.wordhunt;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class sqliteDB {
    public static final String DB_NAME = "wordhuntdemo.db";
    public static final int VERSION = 1;
    private static sqliteDB sqliteDB;
    private SQLiteDatabase db;

    private sqliteDB(Context context) {
        MyDatabaseHelper dbHelper = new MyDatabaseHelper(context, DB_NAME, null, VERSION);
        db = dbHelper.getWritableDatabase();
    }

    public synchronized static sqliteDB getInstance(Context context) {
        if (sqliteDB == null) {
            sqliteDB = new sqliteDB(context);
            System.out.println("成功");
        }
        return sqliteDB;
    }

    public int saveuser(User user) {

        if (user != null) {
            System.out.println("已进入");
            Cursor cursor = db.rawQuery("select user_name from User where user_name=?", new String[]{user.getUser_name().toString()});
            System.out.println("已进入了");
            if (cursor.getCount() > 0) {
                System.out.println("用户已存在");
                return -1;
            } else {
                System.out.println("注册成功");
                try {
                    db.execSQL("insert into User(user_name,password,age,sexe) values(?,?,?,?) ", new String[]{user.getUser_name(),
                            user.getPassword(),
                            user.getAge(),
                            user.getSexe()});
                } catch (Exception e) {
                    Log.d("错误", e.getMessage());
                }
                return 1;
            }
        }
        else {
            System.out.println("其他");
            return 0;
        }
    }

    public List<User> loadUser() {
        List<User> list = new ArrayList<>();
        Cursor cursor = db
                .query("User", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                User user = new User();
                user.setUser_id(cursor.getInt(cursor.getColumnIndex("id")));
                user.setUser_name(cursor.getString(cursor.getColumnIndex("user_name")));
                user.setPassword(cursor.getString(cursor.getColumnIndex("password")));
                user.setAge(cursor.getString(cursor.getColumnIndex("age")));
                user.setSexe(cursor.getString(cursor.getColumnIndex("sexe")));
                list.add(user);
            } while (cursor.moveToNext());
        }
        return list;
    }

    public int Quer(String pwd,String name)
    {


        HashMap<String,String> hashmap=new HashMap<String,String>();
        Cursor cursor =db.rawQuery("select user_name from User where user_name=?", new String[]{name});

        // hashmap.put("name",db.rawQuery("select * from User where name=?",new String[]{name}).toString());
        if (cursor.getCount()>0)
        {
            System.out.println("进入登录");
            Cursor pwdcursor =db.rawQuery("select * from User where password=? and user_name=?",new String[]{pwd,name});
            if (pwdcursor.getCount()>0)
            {
                //正确
                return 1;
            }
            else {
                //密码错误
                return -1;
            }
        }
        else {
            //用户不存在
            return 0;
        }


    }

}
