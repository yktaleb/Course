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

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Note note = (Note) o;
//
//        if (!subscriber.equals(note.subscriber)) return false;
//        if (!contacts.equals(note.contacts)) return false;
//        if (group != note.group) return false;
//        if (!address.equals(note.address)) return false;
//        if (!timeCreation.equals(note.timeCreation)) return false;
//        if (!timeLastModification.equals(note.timeLastModification)) return false;
//        return comment.equals(note.comment);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = subscriber.hashCode();
//        result = 31 * result + contacts.hashCode();
//        result = 31 * result + group.hashCode();
//        result = 31 * result + address.hashCode();
//        result = 31 * result + timeCreation.hashCode();
//        result = 31 * result + timeLastModification.hashCode();
//        result = 31 * result + comment.hashCode();
//        return result;
//    }
//
//


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
