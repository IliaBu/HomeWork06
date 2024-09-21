package application.interfaces;

import domain.Note;
import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    boolean saveChanges();


}
