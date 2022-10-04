package com.freecodecloud.task.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.freecodecloud.task.ui.theme.NoteHotPink
import com.freecodecloud.task.ui.theme.NoteMint
import com.freecodecloud.task.ui.theme.NoteTiffanyBlue
import com.freecodecloud.task.ui.theme.NoteYellow

@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {

        val noteColors = listOf(NoteHotPink, NoteTiffanyBlue, NoteMint, NoteYellow)
    }
}


class InvalidNoteException(message: String) : Exception(message)