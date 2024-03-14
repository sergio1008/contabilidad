package com.berlin.sscontable.service.impl;

import com.berlin.sscontable.dto.DepartmentDTO;
import com.berlin.sscontable.mapper.DepartmentMapper;
import com.berlin.sscontable.persistence.repository.DepartmentRepository;
import com.berlin.sscontable.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    private final DepartmentMapper departmentMapper;
    @Override
    public List<DepartmentDTO> getAll() {
        return departmentRepository.findAll().stream().map(departmentMapper::entityToDTO).collect(Collectors.toList());
    }
}
