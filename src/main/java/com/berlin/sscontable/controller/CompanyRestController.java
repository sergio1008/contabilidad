package com.berlin.sscontable.controller;

import com.berlin.sscontable.dto.CompanyDTO;
import com.berlin.sscontable.service.CompanyService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresas")
@RequiredArgsConstructor
public class CompanyRestController {
    private final CompanyService companyService;


    @PostMapping
    public ResponseEntity<CompanyDTO> create(@RequestBody @Valid CompanyDTO companyDTO) {
        try {
            return ResponseEntity.ok(companyService.create(companyDTO));
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().header("message", ex.getMessage()).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompanyDTO> update(@PathVariable(name = "id") Long id, @RequestBody @Valid CompanyDTO companyDTO) {
        try {
            return ResponseEntity.ok(companyService.update(id, companyDTO));
        }catch (NoSuchElementException noSuchElementException){
            return ResponseEntity.notFound().header("message", "Empresa no existe").build();
        }catch (Exception ex) {
            return ResponseEntity.internalServerError().header("message", ex.getMessage()).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyDTO> getById(@PathVariable(name = "id") Long id) {
        try {
            return ResponseEntity.ok(companyService.getCompanyById(id));
        } catch (Exception ex) {
            return ResponseEntity.internalServerError().header("message", ex.getMessage()).build();
        }
    }
}
