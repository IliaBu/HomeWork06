package queries.views;

import domain.Note;

import java.util.Collection;

public interface Presenter {
    void printAll(Collection<Note> notes);
}
