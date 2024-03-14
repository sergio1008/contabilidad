package com.berlin.sscontable.dto;

import com.berlin.sscontable.persistence.entity.DepartamentEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.mapstruct.Mapper;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDTO {
    private Long id;
    private String municipio;
    private DepartmentDTO departamento;
    private Integer estado;
}
