package com.vesolovskyi.domain;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
public class Delivery {
    private Integer id;
    private String name;
    private String address;
    private String workSchedule;
    private String deliveryTime;
    private String discount;
    private String paymentMethod;
    private com.vesolovskyi.domain.Address addressByIdAddress;
    private Set<Client> clients;
    private Set<com.vesolovskyi.domain.Courier> deliveriess;

    public Delivery(Integer id, String name, String address, String workSchedule, String deliveryTime, String discount, String paymentMethod, String addressByIdAddress, String clients, String deliveriess) {

    }

    public Delivery() {

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
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "work_schedule")
    public String getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        this.workSchedule = workSchedule;
    }

    @Basic
    @Column(name = "delivery_time")
    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Basic
    @Column(name = "discount")
    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(id, delivery.id) && Objects.equals(name, delivery.name) && Objects.equals(address,
                delivery.address) && Objects.equals(workSchedule, delivery.workSchedule) && Objects.equals(deliveryTime,
                delivery.deliveryTime) && Objects.equals(discount, delivery.discount) && Objects.equals(paymentMethod,
                delivery.paymentMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, workSchedule, deliveryTime, discount, paymentMethod);
    }

    @ManyToOne
    @JoinColumn(name = "id_address", referencedColumnName = "id", nullable = false)
    public com.vesolovskyi.domain.Address getAddressByIdAddress() {
        return addressByIdAddress;
    }

    public void setAddressByIdAddress(com.vesolovskyi.domain.Address addressByIdAddress) {
        this.addressByIdAddress = addressByIdAddress;
    }

    @ManyToMany(mappedBy = "deliveries")
    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    @ManyToMany
    @JoinTable(name = "delivery_has_courier", catalog = "", schema = "vesolovskyi", joinColumns =
    @JoinColumn(name = "id_delivery", referencedColumnName = "id", nullable = false), inverseJoinColumns =
    @JoinColumn(name = "id_courier", referencedColumnName = "id", nullable = false))
    public Set<com.vesolovskyi.domain.Courier> getDeliveriess() {
        return deliveriess;
    }

    public void setDeliveriess(Set<com.vesolovskyi.domain.Courier> deliveriess) {
        this.deliveriess = deliveriess;
    }

    @Override
    public String toString() {
        return "\n\nDelivery: id: " + id + ", name: " + name + ", address: " + address + ", workSchedule: " +
                workSchedule + ", deliveryTime: " +
                deliveryTime + ", discount: " + discount + ", paymentMethod: " + paymentMethod + "]";
    }
}
