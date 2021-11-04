package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "address")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class AddressEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 82)
    private String name;
}
