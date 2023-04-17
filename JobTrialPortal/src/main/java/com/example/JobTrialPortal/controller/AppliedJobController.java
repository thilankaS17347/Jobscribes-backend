package com.example.JobTrialPortal.controller;

import com.example.JobTrialPortal.model.AppliedJob;
import com.example.JobTrialPortal.repository.AppliedJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/appliedJob")
public class AppliedJobController {
    @Autowired
    private AppliedJobRepo appliedJobRepo;

    @PostMapping("/applyJob")
    public ResponseEntity<String> applyJob(@RequestBody AppliedJob appliedJob)
    {
        long id = appliedJobRepo.save(appliedJob).getApplied_id();
        return new ResponseEntity<>(String.valueOf(id).concat(" Applied on job"), HttpStatus.OK);

    }

    @GetMapping("/Applications/{j_id}")
    public ResponseEntity<List<String>> getApplications(@PathVariable long j_id){
        return new ResponseEntity<>(appliedJobRepo.getApplications(j_id),HttpStatus.OK);
    }

}
