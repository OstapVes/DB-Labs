package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Client {
    private Integer id;
    private String name;
    private String telNumber;
    private String address;
    private String paymentForDelivery;
    private com.vesolovskyi.domain.City cityByIdCity;
    private Set<com.vesolovskyi.domain.Delivery> deliveries;

    public Client() {

    }

    public Client(Integer id, String name, String telNumber, String location, String transport, String fulfilledTheOrder, String couriers) {

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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "payment_for_delivery")
    public String getPaymentForDelivery() {
        return paymentForDelivery;
    }

    public void setPaymentForDelivery(String paymentForDelivery) {
        this.paymentForDelivery = paymentForDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) && Objects.equals(name, client.name) && Objects.equals(telNumber,
                client.telNumber) && Objects.equals(address, client.address) && Objects.equals(paymentForDelivery,
                client.paymentForDelivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, telNumber, address, paymentForDelivery);
    }

    @ManyToOne
    @JoinColumn(name = "id_city", referencedColumnName = "id", nullable = false)
    public com.vesolovskyi.domain.City getCityByIdCity() {
        return cityByIdCity;
    }

    public void setCityByIdCity(com.vesolovskyi.domain.City cityByIdCity) {
        this.cityByIdCity = cityByIdCity;
    }

    @ManyToMany
    @JoinTable(name = "client_has_delivery", catalog = "", schema = "vesolovskyi", joinColumns = @JoinColumn(name = "id_client", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "id_delivery", referencedColumnName = "id", nullable = false))
    public Set<com.vesolovskyi.domain.Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(Set<com.vesolovskyi.domain.Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    @Override
    public String toString() {
        return "\n\nClient: id: " + id + ", name: " + name + ", telNumber:" + telNumber + ", address:" + address + ", " +
                "paymentForDelivery:" + paymentForDelivery + "]";
    }
}
