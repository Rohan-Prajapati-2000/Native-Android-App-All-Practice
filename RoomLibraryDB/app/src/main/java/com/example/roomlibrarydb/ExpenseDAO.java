package com.example.roomlibrarydb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExpenseDAO {
    @Query("select * from DailyExpense")
    List<Expenses> getAllExpense();

    @Insert
    void addNew(Expenses expenses);

    @Update
    void updateItem(Expenses expenses);

    @Delete
    void deleteItem(Expenses expenses);
}
