package com.berlin.sscontable.service;

import com.berlin.sscontable.dto.CompanyDTO;

public interface CompanyService {
    CompanyDTO create(final CompanyDTO  companyDTO);
    CompanyDTO update(final Long id, final CompanyDTO companyDTO);
    CompanyDTO getCompanyById(final Long id);
}
