package com.example.JobTrialPortal.service;

import com.example.JobTrialPortal.model.Applicant;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ApplicantServiceInterface {
    public long addApplicant(Applicant applicant);
    public List<Applicant> getAllApplicants();

    public Applicant getApplicantById(long id);
    public void deleteApplicant(long id);
}
