package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "courier")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class CourierEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 82)
    private String name;
    @Column (name = "tel_number")
    private Integer tel_number;
    @Column (name = "location", length = 82)
    private Integer location;
    @Column (name = "transport", length = 82)
    private String transport;
    @Column (name = "fulfilled_the_order")
    private Integer fulfilled_the_order;
}
