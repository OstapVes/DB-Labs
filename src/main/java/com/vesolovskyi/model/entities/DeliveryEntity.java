package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "delivery")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class DeliveryEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 82)
    private String name;
    @Column(name = "address")
    private Integer address;
    @Column(name = "work_schedule")
    private String work_schedule;
    @Column(name="delivery_time",length = 45)
    private  String delivery_time;
    @Column(name = "discount")
    private String discount;
    @Column(name = "payment_method")
    private String payment_method;
    @Column(name = "id_address")
    private Integer id_address;
    @Column(name = "id_pizza")
    private Integer id_pizza;
    @Column(name = "id_drink")
    private Integer id_drink;
    @Column(name = "id_salad")
    private Integer id_salad;

}
