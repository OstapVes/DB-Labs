package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class ClientEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 82)
    private String name;
    @Column (name = "tel_number")
    private Integer tel_number;
    @Column (name = "address", length = 82)
    private String address;
    @Column (name = "payment_for_delivery", length = 82)
    private String payment_for_delivery;
    @Column (name = "id_city")
    private Integer id_city;
    @Column (name = "id_street")
    private Integer id_street;
}
