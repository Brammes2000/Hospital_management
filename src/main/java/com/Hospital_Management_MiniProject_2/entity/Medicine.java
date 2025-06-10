package com.Hospital_Management_MiniProject_2.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "medicines")
public class Medicine {

    @Id
    private String id;

    private String name;
    private String dosage;
    private String description;
    private String expiryDate;

    private String doctorId;
    private String patientId;


}
