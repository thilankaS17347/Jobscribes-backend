package com.example.JobTrialPortal.service;

import com.example.JobTrialPortal.model.Applicant;
import com.example.JobTrialPortal.repository.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ApplicantImplementation implements ApplicantServiceInterface{

    @Autowired
    private ApplicantRepo applicantRepo;
    @Override
    public long addApplicant(Applicant applicant) {
        return applicantRepo.save(applicant).getA_id();
    }

    @Override
    public List<Applicant> getAllApplicants() {
        return (List<Applicant>) applicantRepo.findAll();
    }

    @Override
    public Applicant getApplicantById(long id) {
        return (Applicant) applicantRepo.findById(id).get();
    }

    @Override
    public void deleteApplicant(long id) {
        applicantRepo.deleteById(id);
    }
}
