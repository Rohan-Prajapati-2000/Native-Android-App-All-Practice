package com.example.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.Struct;
import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="studentInfo";
    private static final int VERSION=1;
    private static final String TABLE_NAME="student";
    private static final String KEY_ID="id";
    private static final String KEY_NAME="name";
    private static final String KEY_PHONE_NO="phone_no";


    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
//        CREATE TABLE student(id INTEGER AUTOMATIC INCREMENT, name TEXT, phone_nu TEXT);
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME +
                "(" + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +  KEY_NAME + " TEXT," + KEY_PHONE_NO + " TEXT" + ")");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME );

        onCreate(sqLiteDatabase);
    }

    public void addContact(String name, String contact_no){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, name);
        values.put(KEY_PHONE_NO, contact_no);

        db.insert(TABLE_NAME, null, values);
    }


    public ArrayList<StructureContext> fetchInfo(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(" SELECT * FROM "+ TABLE_NAME, null);
        ArrayList<StructureContext> arrayContext = new ArrayList<>();

        while (cursor.moveToNext()){
            StructureContext context = new StructureContext();
            context.id = cursor.getInt(0);
            context.name = cursor.getString(1);
            context.phone_no = cursor.getString(2);

            arrayContext.add(context);
        }

        return arrayContext;

    }


//UPDATE
    public void updateInfo(StructureContext context){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_PHONE_NO, context.phone_no);
        db.update(TABLE_NAME, values, KEY_ID+ " = " + context.id, null);
    }


//    DELETE
    public void deleteContact(int id){
        SQLiteDatabase database = this.getWritableDatabase();

        database.delete(TABLE_NAME, KEY_ID + " = ? ", new String[]{String.valueOf(id)});
    }

}



