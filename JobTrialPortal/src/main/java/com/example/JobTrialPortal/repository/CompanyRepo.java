package com.example.JobTrialPortal.repository;

import com.example.JobTrialPortal.model.Applicant;
import com.example.JobTrialPortal.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CompanyRepo extends JpaRepository<Company, Long> {
    @Query(value = "SELECT * from company where c_email = ?1",nativeQuery = true)
    public List<Company> getCredentials(String email);
}
