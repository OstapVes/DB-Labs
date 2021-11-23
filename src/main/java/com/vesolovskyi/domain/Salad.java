package com.vesolovskyi.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Salad {
    private Integer id;
    private String name;
    private Integer price;
    private String composition;
    private String weight;
    private Integer callories;

    public Salad(Integer id, String name, String price, String composition, String weight, Integer callories) {

    }

    public Salad() {

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
    @Column(name = "composition")
    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
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
        Salad salad = (Salad) o;
        return Objects.equals(id, salad.id) && Objects.equals(name, salad.name) && Objects.equals(price, salad.price) && Objects.equals(composition, salad.composition) && Objects.equals(weight, salad.weight) && Objects.equals(callories, salad.callories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, composition, weight, callories);
    }

    @Override
    public String toString() {
        return "\n\nSalad: id: " + id + ", name: " + name + ", price:" + price + ", " + ", composition:" + composition +
                ", callories:" + callories + ", weight:" + weight + "]";
    }
}
