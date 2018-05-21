package com.example.sonnich.eksamensonnich;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class Storage {
    public static final String TAG ="Storage";

    private SQLiteDatabase db;
    private static Storage storage;

    public Storage(Context context) {
        db = new MyDBHelper(context).getWritableDatabase();


    }

    public static Storage getStorage(Context context){

        if(storage==null){
            storage = new Storage(context);
            Log.v(TAG, "Storage Constructed");


        }
        return storage;
    }
}
