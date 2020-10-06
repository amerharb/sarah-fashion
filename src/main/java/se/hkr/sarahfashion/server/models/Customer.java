package se.hkr.sarahfashion.server.models;

public class Customer {
    private String ssn;
    private String name;
    private String address;
    private boolean gender; // true for female and false for male TODO: if there is time make this enum

    public Customer(String ssn, String name, String address, boolean gender){
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }
}
