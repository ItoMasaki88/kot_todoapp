package com.test.todoapp.repository.todo

import com.test.todoapp.model.todo.ToDo
import kotlinx.coroutines.flow.Flow

interface ToDoRepository {
    fun getAll(): Flow<List<ToDo>>
    suspend fun  create(title: String, detail: String)
}