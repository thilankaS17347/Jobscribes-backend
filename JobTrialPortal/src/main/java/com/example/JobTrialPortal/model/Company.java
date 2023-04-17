package com.example.JobTrialPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "company")
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long c_id;

    @Column(name = "c_email",unique = true,nullable = false)
    private String c_email;

    @Column(name = "c_password",nullable = false)
    private String c_password;

    @Column(name = "c_name",nullable = false)
    private String c_name;

    @Column(name = "c_description")
    private String c_description;


}
