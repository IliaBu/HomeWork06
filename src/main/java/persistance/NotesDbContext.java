package persistance;

import application.interfaces.NotesDatabaseContext;
import database.NotesDatabase;
import database.NotesRecord;
import domain.Note;
import persistance.entityconfiguration.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {

    @Override
    public Collection<Note> getAll() {
        Collection<Note> noteslist=new ArrayList<>();
        for (NotesRecord record: ((NotesDatabase)database).getNotesTable().getRecords()) {
            noteslist.add(new Note(
                    record.getId(),
                    record.getUserid(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
                    ));
        }
        return noteslist;
    }

    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }


}
