package com.berlin.sscontable.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CityEntity {
    @Id
    @Column(name = "id_municipio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "municipio", length = 255)
    private String city;

    @JoinColumn(name = "id_departamento")
    @ManyToOne(fetch = FetchType.LAZY)
    private DepartamentEntity department;

    @Column(name = "estado", length = 255)
    private Integer status;


}
