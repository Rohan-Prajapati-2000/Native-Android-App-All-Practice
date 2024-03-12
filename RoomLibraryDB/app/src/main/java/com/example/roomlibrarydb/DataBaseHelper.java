package com.example.roomlibrarydb;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Expenses.class, exportSchema = false, version = 1)
public abstract class DataBaseHelper extends RoomDatabase {
    private static final String DB_NAME = "daily_exp";
    private static DataBaseHelper instance;

    public static synchronized DataBaseHelper getDB(Context contaxt){
        if (instance==null) {
            instance = Room.databaseBuilder(contaxt, DataBaseHelper.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract ExpenseDAO expenseDAO();
}
