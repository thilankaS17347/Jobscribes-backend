package com.example.JobTrialPortal.controller;

import com.example.JobTrialPortal.model.Applicant;
import com.example.JobTrialPortal.model.Company;
import com.example.JobTrialPortal.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/Company")
public class CompanyController {
    @Autowired
    private CompanyRepo companyRepo;
    @PostMapping("/registerCompany")
    public ResponseEntity<String> addStudent(@RequestBody Company company){
        companyRepo.save(company);
        return new ResponseEntity<String>(String.valueOf(company.getC_id()).concat("Company Registered"), HttpStatus.OK);
    }

    @GetMapping("/allCompanies")
    public ResponseEntity<List<Company>> getAllApplicants(){
        return new ResponseEntity<>(companyRepo.findAll(),HttpStatus.OK);
    }
    @GetMapping("/getCompanyOfId/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable("id") long id){
        Company app = companyRepo.findById(id).get();
        return new ResponseEntity<>(app,HttpStatus.OK);
    }
    @GetMapping("/getCredientials/{email}")
    public ResponseEntity<List<Company>> getCredientials(@PathVariable("email") String email){
        List<Company> company = companyRepo.getCredentials(email);
        return new ResponseEntity<>(company,HttpStatus.OK);

    }

}
