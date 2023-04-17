package com.example.JobTrialPortal.repository;

import com.example.JobTrialPortal.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ApplicantRepo extends JpaRepository<Applicant, Long> {

    @Query(value = "SELECT * from applicant where a_email = ?1",nativeQuery = true)
    public List<Applicant> getCredentials(String email);

}
