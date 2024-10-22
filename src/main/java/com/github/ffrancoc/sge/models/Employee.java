package com.github.ffrancoc.sge.models;

import java.time.LocalDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import com.github.ffrancoc.sge.enums.EmployeeGender;
import com.github.ffrancoc.sge.enums.EmployeeMaritalStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "birthdate")
    @NotNull
    private Date birthdate;

    @Column(name = "phone")
    @Null
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    @NotNull
    @Value("${EmployeeGender.MALE}")
    private EmployeeGender gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    @NotNull
    @Value("${EmployeeMaritalStatus.SINGLE}")
    private EmployeeMaritalStatus maritalStatus;

    @Column(name = "salary")
    @NotNull
    private float salary;

    @ManyToOne
    @JoinColumn(name = "department_id")
    @NotNull
    private Department department;

    @Column(name = "created_at")
    @NotNull
    @CreationTimestamp
    private LocalDateTime credatedAt;

    @Column(name = "updated_at")
    @Null
    private LocalDateTime updatedAt;

    @Column(name = "status")
    @NotNull
    @Value("1")
    private int status;

    public Employee(String name, Date birhdate, String phone, EmployeeGender gender,
            EmployeeMaritalStatus maritalStatus, float salary) {
        this.name = name;
        this.birthdate = birhdate;
        this.phone = phone;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }

    public Employee(String name, Date birhdate, EmployeeGender gender,
            EmployeeMaritalStatus maritalStatus, float salary) {
        this.name = name;
        this.birthdate = birhdate;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.salary = salary;
    }
}
