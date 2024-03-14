package com.berlin.sscontable.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;
import java.time.LocalDateTime;

@Entity
@Table(name = "empresa")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {
    @Column(name = "id_empresa")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nit")
    private String nit;

    @Column(name = "razon_social")
    private String businessName;

    @Column(name = "direccion")
    private String address;

    @Column(name = "telefono")
    private String phone;

    @Column(name = "correo_electronico")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_municipio")
    private CityEntity cityEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_departamento")
    private DepartamentEntity departmentEntity;

    @Column(name = "codigo_postal")
    private String postalCode;

    @Column(name = "sitio_web")
    private String website;

    @Column(name = "representante_legal")
    private String legalRepresentative;

    @Column(name = "documento_representante_legal")
    private String documentLegalRepresentative;

    @Column(name = "logo_empresa")
    @Lob
    private String logoCompany;

    @Column(name = "activo")
    private String active;

    @Column(name = "fecha_creacion")
    private LocalDateTime creationDate;

    @Column(name = "fecha_modificacion")
    private LocalDateTime modificationDate;
}
