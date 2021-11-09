package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "delivery_has_courier")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class DeliveryHasCourierEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "id_courier")
    private Integer id_courier;
    @Column (name = "id_delivery")
    private Integer id_delivery;
}
