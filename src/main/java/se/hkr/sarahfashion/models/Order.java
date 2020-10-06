package se.hkr.sarahfashion.models;

public class Order {
    private Long id;
    private String dateOfOrder; // format of "YY-MM-DD" TODO: if there is time make this DateTime type
    private Double totalPrice;
    private boolean paid; // true if payed false if not paid TODO: if there is time make this enum
}
