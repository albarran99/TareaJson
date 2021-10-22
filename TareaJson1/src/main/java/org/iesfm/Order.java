package org.iesfm;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Order {
    private int orderId;
    private Date date;
    private int price;
    private List<Item> items;

    public Order(int orderId, Date date, int price, List<Item> items) {
        this.orderId = orderId;
        this.date = date;
        this.price = price;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && price == order.price && Objects.equals(date, order.date) && Objects.equals(items, order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, date, price, items);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", date=" + date +
                ", price=" + price +
                ", items=" + items +
                '}';
    }
}
