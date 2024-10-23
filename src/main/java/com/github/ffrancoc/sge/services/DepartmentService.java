package com.github.ffrancoc.sge.services;

import org.springframework.stereotype.Service;

import com.github.ffrancoc.sge.repositories.DepartmentRepository;

@Service
public class DepartmentService {
    private final DepartmentRepository repository;

    public DepartmentService(DepartmentRepository repository) {
        this.repository = repository;
    }

}
