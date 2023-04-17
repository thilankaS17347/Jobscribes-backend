package com.example.JobTrialPortal.controller;

import com.example.JobTrialPortal.model.Applicant;
import com.example.JobTrialPortal.repository.ApplicantRepo;
import com.example.JobTrialPortal.service.ApplicantImplementation;
import com.example.JobTrialPortal.service.ApplicantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@SpringBootApplication(scanBasePackages = { "com.example","com.example.JobTrialPortal.service" })
@ComponentScan("com.example.JobTrialPortal")
@RequestMapping("/Applicant")
public class ApplicantController {


    @Autowired
    private ApplicantRepo applicantRepo;

    @PostMapping("/addApplicant")
    public ResponseEntity<String> addStudent(@RequestBody Applicant applicant){
       applicantRepo.save(applicant);
        return new ResponseEntity<String>(String.valueOf(applicant.getA_id()).concat("Applicant Added"), HttpStatus.OK);

    }

    @GetMapping("/allApplicants")
    public ResponseEntity<List<Applicant>> getAllApplicants(){
        return new ResponseEntity<>(applicantRepo.findAll(),HttpStatus.OK);
    }

    @GetMapping("/getApplicantOfId/{id}")
    public ResponseEntity<Applicant> getApplicantById(@PathVariable("id") long id){
        Applicant app = applicantRepo.findById(id).get();
        return new ResponseEntity<>(app,HttpStatus.OK);
    }

    @GetMapping("/getCredientials/{email}")
    public ResponseEntity<List<Applicant>> getCredientials(@PathVariable("email") String email){
        List<Applicant> applicant = applicantRepo.getCredentials(email);
        return new ResponseEntity<>(applicant,HttpStatus.OK);

    }



}
