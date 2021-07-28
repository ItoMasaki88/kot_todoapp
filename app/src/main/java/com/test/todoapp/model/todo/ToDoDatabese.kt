package com.test.todoapp.model.todo

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ToDo::class], version = 1)
abstract class ToDoDatabese: RoomDatabase() {
    abstract fun todoDAO(): ToDoDAO
}