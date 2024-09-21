package database;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class NotesRecord {

    private static int counter = 10000;
    {
        id = ++counter;
    }
    private int id;
    private int userid;
    private String title;
    private String details;
    private Date creationDate;

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        creationDate = new Date();
    }

}
