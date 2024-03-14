package com.berlin.sscontable.controller;

import com.berlin.sscontable.dto.DepartmentDTO;
import com.berlin.sscontable.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departamentos")
@RequiredArgsConstructor
public class DepartmentRestController {

    private final DepartmentService departmentService;
    @GetMapping
    public ResponseEntity<List<DepartmentDTO>> getAll(){
        try {
            return ResponseEntity.ok(departmentService.getAll());
        }catch (Exception e){
            return  ResponseEntity.internalServerError().header("message", e.getMessage()).build();
        }
    }
}
