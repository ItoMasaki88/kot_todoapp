package com.test.todoapp.page.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.test.todoapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ToDoDetailFragment: Fragment(R.layout.todo_detail_fragment) {
    private val vm: ToDoDetailViewModel by viewModels()
}