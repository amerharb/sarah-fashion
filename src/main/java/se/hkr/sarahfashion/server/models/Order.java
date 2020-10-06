package se.hkr.sarahfashion.server.models;

public class Order {
    private long id;
    private String dateOfOrder; // format of "YY-MM-DD" TODO: if there is time make this DateTime type
    private double totalPrice;
    private boolean paid; // true if payed false if not paid TODO: if there is time make this enum
}
