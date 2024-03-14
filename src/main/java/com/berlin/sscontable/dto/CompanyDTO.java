package com.berlin.sscontable.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.sql.Blob;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDTO {
    @JsonProperty("idEmpresa")
    private Long id;

    @JsonProperty("nit")
    @NotBlank(message = "nit no puede ser nulo o vacìo")
    @Length(max = 15)
    private String nit;

    @JsonProperty("razonSocial")
    @NotBlank(message = "razonSocial no puede ser nulo o vacìo")
    @Length(max=255)
    private String businessName;

    @JsonProperty("direccion")
    @NotBlank(message = "direccion no puede ser nulo o vacìo")
    @Length(max=255)
    private String address;

    @JsonProperty("telefono")
    @NotBlank(message = "telefono no puede ser nulo o vacìo")
    @Length(max=20)
    private String phone;

    @JsonProperty("correoElectronico")
    @NotBlank(message = "correoElectronico no puede ser nulo o vacìo")
    @Length(max=255)
    private String email;

    @JsonProperty("municipio")
    private CityDTO cityDTO;

    @JsonProperty("departamento")
    private DepartmentDTO departmentDTO;

    @JsonProperty("codigoPostal")
    private String postalCode;

    @JsonProperty("sitioWeb")
    @Length(max=255)
    private String website;

    @JsonProperty("representanteLegal")
    @NotBlank(message = "representanteLegal no puede ser nulo o vacìo")
    @Length(max=255)
    private String legalRepresentative;

    @JsonProperty("documentoRepresentanteLegal")
    @NotBlank(message = "documentoRepresentanteLegal no puede ser nulo o vacìo")
    @Length(max=15)
    private String documentLegalRepresentative;

    @JsonProperty("logoEmpresa")
    private String logoCompany;

    @JsonProperty("activo")
    private String active;

    @JsonProperty("fechaCreacion")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime creationDate;

    @JsonProperty("fechaModificacion")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modificationDate;
}
