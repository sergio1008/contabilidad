package com.berlin.sscontable.mapper;

import com.berlin.sscontable.dto.DepartmentDTO;
import com.berlin.sscontable.persistence.entity.DepartamentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface DepartmentMapper {
    @Mappings({
            @Mapping(target = "department", source = "departamento")
    })
    DepartamentEntity dtoToEntity(DepartmentDTO departmentDTO);

    @Mappings({
            @Mapping(target = "departamento", source = "department")
    })
    DepartmentDTO entityToDTO(DepartamentEntity departamentEntity);
}
