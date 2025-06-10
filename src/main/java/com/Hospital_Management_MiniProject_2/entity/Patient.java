package com.Hospital_Management_MiniProject_2.entity;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "patients")
public class Patient {

    @Id
    private String id;

    @NotBlank(message = "Doctor name is required")
    private String name;

    @Min(value = 0, message = "Age cannot be negative")
    private int age;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Contact number is required")
    @Pattern(regexp = "\\d{10}", message = "Contact number must be 10 digits")
    private String contactNumber;

    private String address;

    @DBRef
    private List<Doctor> doctors = new ArrayList<>();

    @DBRef
    private List<Medicine> medicines = new ArrayList<>();

    @DBRef
    private List<Appointment> appointments = new ArrayList<>();


}