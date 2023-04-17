package com.example.JobTrialPortal.repository;

import com.example.JobTrialPortal.model.AppliedJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppliedJobRepo extends JpaRepository<AppliedJob, Long> {
    @Query(value = "SELECT * FROM  applied_job INNER JOIN Job ON applied_job.j_id = Job.j_id INNER JOIN Applicant ON applicant.a_id = applied_job.a_id WHERE Job.j_id = ?1",nativeQuery = true)
    public List<String> getApplications(long j_id);
}
