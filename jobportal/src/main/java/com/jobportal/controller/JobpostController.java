package com.jobportal.controller;


import com.jobportal.entity.Jobpost;
import com.jobportal.service.JobpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobpost")

@CrossOrigin(origins = "*")
public class JobpostController {

    @Autowired

    private JobpostService jobpostService;

    @PostMapping
    public ResponseEntity<?> createJobpost(@RequestBody Jobpost jobpost){
        try {
            Jobpost createdJobpost = jobpostService.saveJobpost(jobpost);

            System.out.println("Created Job Post"+jobpost);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdJobpost);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Jobpost>> getAllJobposts(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(jobpostService.getAllPosts());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getJobpostById(@PathVariable("id") Long id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(jobpostService.getJobpostById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("company/{companyName}")
    public ResponseEntity<?> getJobpostBycompanyName(@PathVariable("companyName") String companyName){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(jobpostService.getAllPostsByName(companyName));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}
