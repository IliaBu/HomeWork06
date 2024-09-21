package queries.views;

import application.interfaces.NotesPresenter;
import domain.Note;

import java.util.Collection;

public class NotesConsolePresenter implements NotesPresenter {

    @Override
    public void printAll(Collection<Note> notes) {
        for (Note note : notes){
            System.out.println(note);
        }
    }
}
