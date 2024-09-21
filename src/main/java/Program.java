import application.ConcreteNoteEditor;
import application.interfaces.NoteEditor;
import application.interfaces.NotesDatabaseContext;
import database.NotesDatabase;
import persistance.Database;
import persistance.DatabaseContext;
import persistance.NotesDbContext;
import queries.controllers.NotesController;
import queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));
        controller.routeGetAll();

        System.out.println("------------------------------------------------------------------------------");

        Database database = new NotesDatabase();
        NotesDatabaseContext context = new DatabaseContext(database);
        NotesConsolePresenter notesConsolePresenter = new NotesConsolePresenter();
        NoteEditor noteEditor = new ConcreteNoteEditor(context, notesConsolePresenter);

        NotesController notesController = new NotesController(noteEditor);

        notesController.routeGetAll();
    }

}
