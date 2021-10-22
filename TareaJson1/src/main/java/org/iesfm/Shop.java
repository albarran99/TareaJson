package org.iesfm;

import java.util.List;
import java.util.Objects;

public class Shop {
    private String name;
    private List<Catalog> catalogs;
    private List<Order> orders;

    public Shop(String name, List<Catalog> catalogs, List<Order> orders) {
        this.name = name;
        this.catalogs = catalogs;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Catalog> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) && Objects.equals(catalogs, shop.catalogs) && Objects.equals(orders, shop.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, catalogs, orders);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", catalogs=" + catalogs +
                ", orders=" + orders +
                '}';
    }
}
