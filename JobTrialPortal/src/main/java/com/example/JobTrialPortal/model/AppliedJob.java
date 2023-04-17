package com.example.JobTrialPortal.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "appliedJob")
@Table(name = "appliedJob")
public class AppliedJob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long applied_id;

    @Column(name = "j_id",nullable = false)
    private long j_id;

    @Column(name = "a_id", nullable = false)
    private long a_id;

}
