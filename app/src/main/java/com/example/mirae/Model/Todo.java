package com.example.mirae.Model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Todo_Database")
public class Todo {

    //Creating all the entities
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "todo_title")
    String todoTitle;

    @ColumnInfo(name = "todo_subtitle")
    String todoSubtitle;

    @ColumnInfo(name = "todo")
    String todo;

    @ColumnInfo(name = "todo_date")
    String todoDate;

    @ColumnInfo(name = "todo_priority")
    String todoPriority;

}
