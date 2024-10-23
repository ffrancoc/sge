package com.github.ffrancoc.sge.services;

import org.springframework.stereotype.Service;

import com.github.ffrancoc.sge.repositories.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }
}
