package com.berlin.sscontable.service;

import com.berlin.sscontable.dto.CityDTO;

import java.util.List;

public interface CityService {
    List<CityDTO> getCitiesByDepartmentId(Long departmentId);
}
