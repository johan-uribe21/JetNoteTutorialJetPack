package com.foople.jetnote.data

import com.foople.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Go buy stuff", description = "Need to buy stuff")
        )
    }
}