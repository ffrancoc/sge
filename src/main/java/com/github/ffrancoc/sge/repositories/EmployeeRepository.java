package com.github.ffrancoc.sge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ffrancoc.sge.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
