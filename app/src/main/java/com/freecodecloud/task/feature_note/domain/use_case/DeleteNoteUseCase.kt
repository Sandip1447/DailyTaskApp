package com.freecodecloud.task.feature_note.domain.use_case

import com.freecodecloud.task.feature_note.domain.model.Note
import com.freecodecloud.task.feature_note.domain.repository.NoteRepository

class DeleteNoteUseCase(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        noteRepository.deleteNote(note)
    }
}