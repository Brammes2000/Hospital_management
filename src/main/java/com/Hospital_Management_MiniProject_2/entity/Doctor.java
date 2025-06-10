package com.Hospital_Management_MiniProject_2.entity;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "doctors")
public class Doctor {

    @Id
    private String id;

    @NotBlank(message = "Doctor name is required")
    private String name;

    @NotBlank(message = "Specialization is required")
    private String specialization;

    @DBRef
    private List<Appointment> appointments = new ArrayList<>();

    @DBRef
    private List<Patient> patients = new ArrayList<>();

    @DBRef
    private List<Medicine> medicines = new ArrayList<>();



}
