package domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Note {
    private static int counter = 100;
    private int id;
    {
        id = ++counter;
    }
    private int userId;
    private String title;
    private String details;
    private Date creationDate;
    private Date editDate;

    public Note(int userId, String title, String details, Date creationDate) {
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
    }

    public Note(int id, int userId, String title, String details, Date creationDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        return "Заметка № " + id + ", название: " + title + ", описание: " + details + ", дата создания: " + creationDate;
    }
}
