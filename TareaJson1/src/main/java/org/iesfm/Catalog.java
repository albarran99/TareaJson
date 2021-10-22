package org.iesfm;

import java.util.List;
import java.util.Objects;

public class Catalog {
    private int producId;
    private double price;
    private String name;
    private List<String> classes;

    public Catalog(int producId, double price, String name, List<String> classes) {
        this.producId = producId;
        this.price = price;
        this.name = name;
        this.classes = classes;
    }

    public int getProducId() {
        return producId;
    }

    public void setProducId(int producId) {
        this.producId = producId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Catalog catalog = (Catalog) o;
        return producId == catalog.producId && Double.compare(catalog.price, price) == 0 && Objects.equals(name, catalog.name) && Objects.equals(classes, catalog.classes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producId, price, name, classes);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "producId=" + producId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
