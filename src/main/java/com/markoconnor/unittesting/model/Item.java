package com.markoconnor.unittesting.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    private Integer id;

    private String name;
    private Integer price;
    private Integer quantity;

    @javax.persistence.Transient
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Item() {

    }

    public String toString() {

        return String.format("Item[%d, %s, %d, %d]", id, name, price, quantity);
    }
}
