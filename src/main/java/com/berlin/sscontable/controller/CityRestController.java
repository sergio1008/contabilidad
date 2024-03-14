package com.berlin.sscontable.controller;


import com.berlin.sscontable.dto.CityDTO;
import com.berlin.sscontable.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/municipios")
@RequiredArgsConstructor
public class CityRestController {

    private final CityService cityService;
    @GetMapping("/{departmentId}")
    public ResponseEntity<List<CityDTO>> getCitiesByDepartmentId(@PathVariable(name = "departmentId") Long departmentId){
        try{
            return ResponseEntity.ok(cityService.getCitiesByDepartmentId(departmentId));
        }catch (Exception e){
            return  ResponseEntity.internalServerError().header("message", e.getMessage()).build();
        }
    }
}
