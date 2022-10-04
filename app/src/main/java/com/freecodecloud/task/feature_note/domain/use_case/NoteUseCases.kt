package com.freecodecloud.task.feature_note.domain.use_case

data class NoteUseCases(
    val getNoteUseCase: GetNoteUseCase,
    val getNotesUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
)