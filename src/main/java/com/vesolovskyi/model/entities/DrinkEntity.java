package com.vesolovskyi.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "drink", schema = "vesolovskyi", catalog = "")
public class DrinkEntity {
    private Integer id;
    private String name;
    private String size;
    private Integer price;
    private Integer callories;

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
        DrinkEntity that = (DrinkEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(size, that.size) && Objects.equals(price, that.price) && Objects.equals(callories, that.callories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, size, price, callories);
    }
}
