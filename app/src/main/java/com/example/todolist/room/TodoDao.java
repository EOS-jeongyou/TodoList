package com.example.todolist.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public class TodoDao {
    @Insert
    void insertTodo(TodoItem item){};
    @Delete
    void deleteTodo(TodoItem item){};
    @Query("delete from TODO")
    void deleteAllTodo(){};
    @Update
    void editTodo(TodoItem item){};
}