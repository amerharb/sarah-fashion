package se.hkr.sarahfashion.server.models;

public class Order {
    private long id;
    private String dateOfOrder; // format of "YY-MM-DD" TODO: if there is time make this DateTime type
    private double totalPrice;
    private PaymentStatus status;

    public enum PaymentStatus {paid, notPaid}


    public Order(long id, String dateOfOrder, double totalPrice, PaymentStatus status) {
        this.id = id;
        this.dateOfOrder = dateOfOrder;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(String dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
