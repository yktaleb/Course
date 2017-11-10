package by.training.model.entity;


public class Address {
    private String index;
    private String city;
    private String street;
    private String building;
    private String apartmentNumber;

    public Address() {
    }

    public Address(String index, String city, String street, String building, String apartmentNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.building = building;
        this.apartmentNumber = apartmentNumber;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (!index.equals(address.index)) return false;
        if (!city.equals(address.city)) return false;
        if (!street.equals(address.street)) return false;
        if (!building.equals(address.building)) return false;
        return apartmentNumber.equals(address.apartmentNumber);
    }

    @Override
    public int hashCode() {
        int result = index.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + building.hashCode();
        result = 31 * result + apartmentNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index='" + index + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                '}';
    }
}
