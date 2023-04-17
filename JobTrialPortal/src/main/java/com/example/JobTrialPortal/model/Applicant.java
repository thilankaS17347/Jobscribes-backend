package com.example.JobTrialPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "applicant")
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long a_id;

    @Column(name = "a_email",unique = true,nullable = false)
    private String a_email;

    @Column(name = "a_password",nullable = false)
    private String a_password;

    @Column(name = "a_username",nullable = false)
    private String a_username;

    @Column(name = "a_description")
    private String a_description;


}
