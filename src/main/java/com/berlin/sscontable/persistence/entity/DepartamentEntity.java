package com.berlin.sscontable.persistence.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class DepartamentEntity {
    @Id
    @Column(name = "id_departamento",  length = 255)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "departamento")
    private String department;
}
