package database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private static final Random random = new Random();

    private Collection<NotesRecord> records;

    public Collection<NotesRecord> getRecords() {
        if (records == null){
            records = new ArrayList<>();
            int recordCount = random.nextInt(5, 11);
            for (int i = 0; i < recordCount; i++){
                records.add(new NotesRecord("title #" + (i + 1), "details #" + (i + 1)));
            }
        }
        return records;
    }

}
