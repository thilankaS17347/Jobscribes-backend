package com.example.JobTrialPortal.controller;

import com.example.JobTrialPortal.model.Company;
import com.example.JobTrialPortal.model.Job;
import com.example.JobTrialPortal.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Job")
public class JobController {
    @Autowired
    private JobRepo jobRepo   ;

    @PostMapping("/publishJob")
    public ResponseEntity<String> publishJob(@RequestBody Job job){
        jobRepo.save(job);
        long job_id = job.getJ_id();
        return  new ResponseEntity<>(String.valueOf(job_id).concat(" of job added"), HttpStatus.OK);
    }
    @GetMapping("/allJobs")
    public ResponseEntity<List<Job>> getAllApplicants(){
        return new ResponseEntity<>(jobRepo.findAll(),HttpStatus.OK);
    }

    @GetMapping("/getByCompany/{c_id}")
    public ResponseEntity<List<Job>> getJobByCompany(@PathVariable long c_id){
        return new ResponseEntity<>(jobRepo.getCompanyJobs(c_id),HttpStatus.OK);
    }

    @GetMapping("/getByStatus/{status}")
    public ResponseEntity<List<Job>> getJobByStatus(@PathVariable String status){
        return new ResponseEntity<>(jobRepo.getOpenJobs(status),HttpStatus.OK);
    }



}
