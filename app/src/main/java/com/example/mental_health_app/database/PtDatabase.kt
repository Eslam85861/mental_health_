package com.example.mental_health_app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mental_health_app.database.dao.ChatDao
import com.example.mental_health_app.database.dao.NotesDao
import com.example.mental_health_app.database.dao.YogaDao
import com.example.mental_health_app.database.entities.MessageEntity
import com.example.mental_health_app.database.entities.NoteEntity
import com.example.mental_health_app.database.entities.YogaEntity

@Database(entities = [MessageEntity::class , NoteEntity::class, YogaEntity::class], version = 1, exportSchema = false)
abstract class PtDatabase : RoomDatabase(){

    abstract fun messagesDao(): ChatDao
    abstract fun notesDao(): NotesDao
    abstract fun yogaDao(): YogaDao
}