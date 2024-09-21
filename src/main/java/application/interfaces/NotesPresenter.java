package application.interfaces;

import domain.Note;
import java.util.Collection;

public interface NotesPresenter {

    void printAll(Collection<Note> notes);

}
