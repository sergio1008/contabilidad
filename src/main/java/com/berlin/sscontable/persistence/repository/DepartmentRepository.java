package com.berlin.sscontable.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berlin.sscontable.persistence.entity.DepartamentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartamentEntity, Long> {
    
}
