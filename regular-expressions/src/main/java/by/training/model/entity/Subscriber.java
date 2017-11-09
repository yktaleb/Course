package by.training.model.entity;


public class Subscriber {
    private String surname;
    private String name;
    private String patronymic;
    private String nickname;
    private Contacts contacts;
    private Group group;
    private Address address;

    public Subscriber() {
    }

    public Subscriber(String surname, String name, String patronymic, String nickname,
                      Contacts contacts, Group group, Address address) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickname = nickname;
        this.contacts = contacts;
        this.group = group;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Contacts getContacts() {
        return contacts;
    }

    public void setContacts(Contacts contacts) {
        this.contacts = contacts;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //    public String getFullName() {
//        return surname + " " + name.substring(0, 1) + ".";
//    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Subscriber that = (Subscriber) o;
//
//        if (!surname.equals(that.surname)) return false;
//        if (!name.equals(that.name)) return false;
//        if (!patronymic.equals(that.patronymic)) return false;
//        return nickname.equals(that.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = surname.hashCode();
//        result = 31 * result + name.hashCode();
//        result = 31 * result + patronymic.hashCode();
//        result = 31 * result + nickname.hashCode();
//        return result;
//    }
//
    public String getFullName() {
        return surname + " " + name.substring(0, 1) + ".";
    }


    @Override
    public String toString() {
        return "Subscriber{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickname='" + nickname + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", contacts=" + contacts +
                ", group=" + group +
                ", address=" + address +
                '}';
    }
}
