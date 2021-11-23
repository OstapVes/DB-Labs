package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "additives_for_pizza", schema = "vesolovskyi", catalog = "")
public class AdditivesForPizza {
    private Integer id;
    private String name;
    private Integer callories;
    private Integer price;

    public AdditivesForPizza(Integer id, String name, String callories, String price) {

    }

    public AdditivesForPizza() {

    }

    public AdditivesForPizza(Integer id, String name) {

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
    @Column(name = "callories")
    public Integer getCallories() {
        return callories;
    }

    public void setCallories(Integer callories) {
        this.callories = callories;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditivesForPizza that = (AdditivesForPizza) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(callories, that.callories) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, callories, price);
    }

    @Override
    public String toString() {
        return "\n\nAdditivesForPizza: id: " + id + ", name: " + name + ", callories: " + callories + ", price: " + price + "]";
    }
}
