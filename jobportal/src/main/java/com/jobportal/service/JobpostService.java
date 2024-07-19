package com.jobportal.service;

import com.jobportal.entity.Jobpost;

import java.util.List;

public interface JobpostService {

    Jobpost saveJobpost(Jobpost jobpost);

    List<Jobpost> getAllPosts();

    Jobpost getJobpostById(Long id);

    List<Jobpost> getAllPostsByName(String companyName);
}
