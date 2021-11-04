package com.vesolovskyi.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pizza")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class PizzaEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 82)
    private String name;
    @Column(name = "price")
    private Integer price;
    @Column(name = "callories")
    private String callories;
    @Column(name="weight")
    private  String weight;
    @Column(name = "size")
    private String size;
    @Column(name = "id_add")
    private Integer id_add;
    @Column(name = "id_composition")
    private Integer id_composition;
}
