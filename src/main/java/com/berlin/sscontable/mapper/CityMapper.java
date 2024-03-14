package com.berlin.sscontable.mapper;

import com.berlin.sscontable.dto.CityDTO;
import com.berlin.sscontable.persistence.entity.CityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface CityMapper {

    @Mappings({
            @Mapping(target ="city", source = "municipio"),
            @Mapping(target ="department", source = "departamento"),
            @Mapping(target ="status", source = "estado")
    })
    CityEntity dtoToEntity(CityDTO cityDTO);

    @Mappings({
            @Mapping(target ="municipio", source = "city"),
            @Mapping(target ="departamento", source = "department"),
            @Mapping(target ="estado", source = "status")
    })
    CityDTO entityToDTO(CityEntity city);
}
