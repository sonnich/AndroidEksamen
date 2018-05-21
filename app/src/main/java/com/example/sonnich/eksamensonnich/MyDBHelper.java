package com.example.sonnich.eksamensonnich;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String TAG = "DBHelper";
    private static final String DB_NAME = "shopApp";
    private static final int DB_VERSION = 2;

    public MyDBHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
        //context.deleteDatabase(this.DB_NAME);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
