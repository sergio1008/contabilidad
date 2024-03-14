package com.berlin.sscontable.mapper;

import com.berlin.sscontable.dto.CompanyDTO;
import com.berlin.sscontable.persistence.entity.CompanyEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CompanyMapper {
    @Mappings({
            @Mapping(target = "cityDTO", source = "cityEntity"),
            @Mapping(target = "departmentDTO", source = "departmentEntity")
    })
    CompanyDTO entityToDTO(CompanyEntity companyEntity);

    @Mappings({
            @Mapping(target = "cityEntity", source = "cityDTO"),
            @Mapping(target = "departmentEntity", source = "departmentDTO")
    })
    CompanyEntity dtoToEntity(CompanyDTO companyDTO);
}
