package com.berlin.sscontable.persistence.repository;


import com.berlin.sscontable.persistence.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity, Long> {

    @Query(value = "SELECT m.*, d.departamento from municipios m inner join departamentos d on m.id_departamento = d.id_departamento \n" +
            "WHERE d.id_departamento  = ?1", nativeQuery = true)
    List<CityEntity> findByDepartmentId(Long id);
    
}
