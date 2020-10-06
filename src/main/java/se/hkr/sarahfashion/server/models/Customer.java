package se.hkr.sarahfashion.server.models;

public class Customer {
    private String ssn;
    private String name;
    private String address;
    private boolean gender; // true for female and false for male TODO: if there is time make this enum

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSsn() {
        return ssn;
    }
}
