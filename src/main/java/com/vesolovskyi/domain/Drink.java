package com.vesolovskyi.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Drink {
    private Integer id;
    private String name;
    private String size;
    private Integer price;
    private Integer callories;

    public Drink(Integer id, String name, String size, String price, String callories) {

    }

    public Drink() {

    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "callories")
    public Integer getCallories() {
        return callories;
    }

    public void setCallories(Integer callories) {
        this.callories = callories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Objects.equals(id, drink.id) && Objects.equals(name, drink.name) && Objects.equals(size, drink.size) && Objects.equals(price, drink.price) && Objects.equals(callories, drink.callories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, size, price, callories);
    }
    @Override
    public String toString() {
        return "\n\nDrink: id: " + id + ", name: " + name + ", size:" + size + ", price:" + price + ", " +
                "callories:" + callories  + "]";
    }
}
