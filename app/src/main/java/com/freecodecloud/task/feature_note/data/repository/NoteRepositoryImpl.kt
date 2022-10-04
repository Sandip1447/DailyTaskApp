package com.freecodecloud.task.feature_note.data.repository

import com.freecodecloud.task.feature_note.data.data_source.NoteDao
import com.freecodecloud.task.feature_note.domain.model.Note
import com.freecodecloud.task.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
  private val noteDao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(noteId: Int): Note? {
        return noteDao.getNoteById(noteId)
    }

    override suspend fun insertNote(note: Note) {
        return noteDao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note) {
       return noteDao.deleteNote(note)
    }


}