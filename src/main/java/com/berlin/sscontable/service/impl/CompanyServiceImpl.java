package com.berlin.sscontable.service.impl;

import com.berlin.sscontable.dto.CompanyDTO;
import com.berlin.sscontable.mapper.CompanyMapper;
import com.berlin.sscontable.persistence.entity.CompanyEntity;
import com.berlin.sscontable.persistence.repository.CompanyRepository;
import com.berlin.sscontable.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    private final CompanyMapper companyMapper;
    @Override
    public CompanyDTO create(CompanyDTO companyDTO) {
        CompanyEntity companyEntity = companyRepository.save(companyMapper.dtoToEntity(companyDTO));
        return companyMapper.entityToDTO(companyEntity);
    }

    @Override
    public CompanyDTO update(Long id, CompanyDTO companyDTO) {
        if(companyRepository.existsById(id)){
          companyDTO.setId(id);
          CompanyEntity companyEntity = companyRepository.save(companyMapper.dtoToEntity(companyDTO));
          return  companyMapper.entityToDTO(companyEntity);
        }else{
            throw  new NoSuchElementException("No value present");
        }
    }

    @Override
    public CompanyDTO getCompanyById(Long id) {
        return companyMapper.entityToDTO(companyRepository.findById(id).orElseThrow());
    }
}
