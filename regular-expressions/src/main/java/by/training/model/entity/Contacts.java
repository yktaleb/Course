package by.training.model.entity;


public class Contacts {
    private String homePhone;
    private String mobilePhone1;
    private String mobilePhone2;
    private String email;
    private String skype;

    public Contacts(String homePhone, String mobilePhone1, String mobilePhone2, String email, String skype) {
        this.homePhone = homePhone;
        this.mobilePhone1 = mobilePhone1;
        this.mobilePhone2 = mobilePhone2;
        this.email = email;
        this.skype = skype;
    }

    public Contacts() {
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone1() {
        return mobilePhone1;
    }

    public void setMobilePhone1(String mobilePhone1) {
        this.mobilePhone1 = mobilePhone1;
    }

    public String getMobilePhone2() {
        return mobilePhone2;
    }

    public void setMobilePhone2(String mobilePhone2) {
        this.mobilePhone2 = mobilePhone2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contacts contacts = (Contacts) o;

        if (!homePhone.equals(contacts.homePhone)) return false;
        if (!mobilePhone1.equals(contacts.mobilePhone1)) return false;
        if (!mobilePhone2.equals(contacts.mobilePhone2)) return false;
        if (!email.equals(contacts.email)) return false;
        return skype.equals(contacts.skype);
    }

    @Override
    public int hashCode() {
        int result = homePhone.hashCode();
        result = 31 * result + mobilePhone1.hashCode();
        result = 31 * result + mobilePhone2.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + skype.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "homePhone='" + homePhone + '\'' +
                ", mobilePhone1='" + mobilePhone1 + '\'' +
                ", mobilePhone2='" + mobilePhone2 + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                '}';
    }
}
