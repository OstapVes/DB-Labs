package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Pizza {
    private Integer id;
    private String name;
    private Integer price;
    private Integer callories;
    private Integer weight;
    private String size;
    private com.vesolovskyi.domain.AdditivesForPizza additivesForPizzaByIdAdd;

    public Pizza(Integer id, String name, String price, String callories, String weight, Integer size) {

    }

    public Pizza() {

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

    @Basic
    @Column(name = "weight")
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(id, pizza.id) && Objects.equals(name, pizza.name) && Objects.equals(price, pizza.price) && Objects.equals(callories, pizza.callories) && Objects.equals(weight, pizza.weight) && Objects.equals(size, pizza.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, callories, weight, size);
    }

    @ManyToOne
    @JoinColumn(name = "id_add", referencedColumnName = "id", nullable = false)
    public com.vesolovskyi.domain.AdditivesForPizza getAdditivesForPizzaByIdAdd() {
        return additivesForPizzaByIdAdd;
    }

    public void setAdditivesForPizzaByIdAdd(com.vesolovskyi.domain.AdditivesForPizza additivesForPizzaByIdAdd) {
        this.additivesForPizzaByIdAdd = additivesForPizzaByIdAdd;
    }

    @Override
    public String toString() {
        return "\n\nPizza: id: " + id + ", name: " + name + ", size:" + size + ", price:" + price + ", " +
                "callories:" + callories + "weight:" + weight + "]";
    }
}
