package com.test.todoapp

import android.content.Context
import androidx.room.Room
import com.test.todoapp.model.todo.ToDoDAO
import com.test.todoapp.model.todo.ToDoDatabese
import com.test.todoapp.repository.todo.ToDoRepository
import com.test.todoapp.repository.todo.ToDoRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ToDoModule {

    @Singleton
    @Provides
    fun provideToDoDatabase(
        @ApplicationContext context: Context
    ): ToDoDatabese {
        return Room.databaseBuilder(
            context,
            ToDoDatabese::class.java,
            "todo.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideToDoDAO(db: ToDoDatabese): ToDoDAO {
        return db.todoDAO()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class ToDoRepositoryModule {

    @Singleton
    @Binds
    abstract fun bindToDoRepository(
        impl: ToDoRepositoryImpl
    ): ToDoRepository
}