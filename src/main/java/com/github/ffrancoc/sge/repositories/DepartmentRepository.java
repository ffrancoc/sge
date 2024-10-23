package com.github.ffrancoc.sge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ffrancoc.sge.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
