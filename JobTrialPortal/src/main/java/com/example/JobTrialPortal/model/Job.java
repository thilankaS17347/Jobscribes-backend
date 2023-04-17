package com.example.JobTrialPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "job")
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long j_id;

    @Column(name = "c_id",nullable = false)
    private long c_id;

    @Column(name = "j_position",nullable = false)
    private String j_position;

    @Column(name = "j_description")
    private String j_description;

    @Column(name = "j_status",nullable = false)
    private String j_status;



}
