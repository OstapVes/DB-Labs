package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "client_has_delivery")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class ClientHasDeliveryEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "id_client")
    private Integer id_client;
    @Column (name = "id_delivery")
    private Integer id_delivery;
}
