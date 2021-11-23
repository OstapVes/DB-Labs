package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pizza_composition", schema = "vesolovskyi", catalog = "")
public class PizzaComposition {
    private Integer id;
    private String name;

    public PizzaComposition(Integer id, String name) {

    }

    public PizzaComposition() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaComposition that = (PizzaComposition) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "\n\nPizzaComposition: id: " + id + ", name: " + name + "]";
    }
}
