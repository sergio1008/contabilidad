package com.berlin.sscontable.service.impl;

import com.berlin.sscontable.dto.CityDTO;
import com.berlin.sscontable.mapper.CityMapper;
import com.berlin.sscontable.persistence.repository.CityRepository;
import com.berlin.sscontable.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    private final CityMapper cityMapper;
    @Override
    public List<CityDTO> getCitiesByDepartmentId(Long departmentId) {
        return this.cityRepository.findByDepartmentId(departmentId).stream().map(cityMapper::entityToDTO).collect(Collectors.toList());
    }
}
