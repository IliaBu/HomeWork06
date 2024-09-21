package application.interfaces;

import domain.Note;

public interface NoteEditor extends Editor<Note, Integer>{

    void printAll();

}
