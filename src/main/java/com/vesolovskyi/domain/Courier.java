package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Courier {
    private Integer id;
    private String name;
    private String telNumber;
    private String location;
    private String transport;
    private Integer fulfilledTheOrder;
    private Set<Delivery> couriers;

    public Courier(Integer id, String name, String telNumber, String location, String transport, Integer fulfilledTheOrder, String couriers) {


    }

    public Courier() {

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
    @Column(name = "tel_number")
    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "transport")
    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Basic
    @Column(name = "fulfilled_the_order")
    public Integer getFulfilledTheOrder() {
        return fulfilledTheOrder;
    }

    public void setFulfilledTheOrder(Integer fulfilledTheOrder) {
        this.fulfilledTheOrder = fulfilledTheOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(id, courier.id) && Objects.equals(name, courier.name) && Objects.equals(telNumber, courier.telNumber) && Objects.equals(location, courier.location) && Objects.equals(transport, courier.transport) && Objects.equals(fulfilledTheOrder, courier.fulfilledTheOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, telNumber, location, transport, fulfilledTheOrder);
    }

    @ManyToMany(mappedBy = "deliveriess")
    public Set<Delivery> getCouriers() {
        return couriers;
    }

    public void setCouriers(Set<Delivery> couriers) {
        this.couriers = couriers;
    }

    @Override
    public String toString() {
        return "\n\nCourier: id: " + id + ", name: " + name + ", telNumber:" + telNumber + ", location:" + location + ", " +
                "transport:" + transport + ", fulfilledTheOrder:" + fulfilledTheOrder + "]";
    }
}
