package by.training.model.entity;

import java.util.Calendar;
import java.util.Date;

public class Note {

    private Subscriber subscriber;
    private final Date dateCreation = Calendar.getInstance().getTime();
    private Date dateLastModification = Calendar.getInstance().getTime();
    private String comment;

    public Note() {
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDateLastModification() {
        return dateLastModification;
    }

    public void setDateLastModification(Date dateLastModification) {
        this.dateLastModification = dateLastModification;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!subscriber.equals(note.subscriber)) return false;
        if (!dateCreation.equals(note.dateCreation)) return false;
        if (!dateLastModification.equals(note.dateLastModification)) return false;
        return comment.equals(note.comment);
    }

    @Override
    public int hashCode() {
        int result = subscriber.hashCode();
        result = 31 * result + dateCreation.hashCode();
        result = 31 * result + dateLastModification.hashCode();
        result = 31 * result + comment.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "subscriber=" + subscriber +
                ", dateCreation=" + dateCreation +
                ", dateLastModification=" + dateLastModification +
                ", comment='" + comment + '\'' +
                '}';
    }
}
