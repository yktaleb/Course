package by.training.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Calendar;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Note {
    @Id
    @GeneratedValue
    private Long id;
    private final Date dateCreation = Calendar.getInstance().getTime();
    private Date dateLastModification = Calendar.getInstance().getTime();
    private String comment;
    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private Group group;
    private String homePhone;
    private String mobilePhone1;
    private String mobilePhone2;
    private String email;
    private String skype;

    @ManyToOne
    private Address address;

    @ManyToOne
    private User user;

    public String getFullName() {
        return surname + " " + name.substring(0, 1) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (!id.equals(note.id)) return false;
        if (!dateCreation.equals(note.dateCreation)) return false;
        if (!dateLastModification.equals(note.dateLastModification)) return false;
        if (!comment.equals(note.comment)) return false;
        if (!surname.equals(note.surname)) return false;
        if (!name.equals(note.name)) return false;
        if (!patronymic.equals(note.patronymic)) return false;
        if (!nickname.equals(note.nickname)) return false;
        if (group != note.group) return false;
        if (!homePhone.equals(note.homePhone)) return false;
        if (!mobilePhone1.equals(note.mobilePhone1)) return false;
        if (!mobilePhone2.equals(note.mobilePhone2)) return false;
        if (!email.equals(note.email)) return false;
        if (!skype.equals(note.skype)) return false;
        if (!address.equals(note.address)) return false;
        return user.equals(note.user);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + dateCreation.hashCode();
        result = 31 * result + dateLastModification.hashCode();
        result = 31 * result + comment.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + patronymic.hashCode();
        result = 31 * result + nickname.hashCode();
        result = 31 * result + group.hashCode();
        result = 31 * result + homePhone.hashCode();
        result = 31 * result + mobilePhone1.hashCode();
        result = 31 * result + mobilePhone2.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + skype.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", dateCreation=" + dateCreation +
                ", dateLastModification=" + dateLastModification +
                ", comment='" + comment + '\'' +
                ", full name='" + getFullName() + '\'' +
                ", nickname='" + nickname + '\'' +
                ", group=" + group +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone1='" + mobilePhone1 + '\'' +
                ", mobilePhone2='" + mobilePhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", user=" + user +
                '}';
    }
}
