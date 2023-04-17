package com.example.JobTrialPortal.repository;

import com.example.JobTrialPortal.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobRepo extends JpaRepository<Job,Long> {
    @Query(value = "SELECT * FROM Job WHERE j_status = ?1 ",nativeQuery = true)
    public List<Job> getOpenJobs(String status);

    @Query(value = "SELECT * FROM Job WHERE c_id = ?1",nativeQuery = true)
    public List<Job> getCompanyJobs(long c_id);
}
