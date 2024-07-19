package com.jobportal.service;

import com.jobportal.entity.Jobpost;
import com.jobportal.repository.JobpostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class JobpostServiceImpl implements JobpostService{

    @Autowired
    private JobpostRepository jobpostRepository;

    public Jobpost saveJobpost(Jobpost jobpost){

        jobpost.setLikeCount(0);
        jobpost.setViewCount(0);
        jobpost.setPostDate(new Date());
        return jobpostRepository.save(jobpost);
    }


    public List<Jobpost> getAllPosts(){
        return jobpostRepository.findAll();
    }

    public Jobpost getJobpostById(Long id){

        Optional<Jobpost> jobpost = jobpostRepository.findById(id);
        if(jobpost.isPresent()){
            Jobpost post = jobpost.get();
            post.setViewCount(post.getViewCount()+1);
            jobpostRepository.save(post);
            return post;
        }
        else {
            throw new RuntimeException("Jobpost not found with id "+id);
        }
    }


    public List<Jobpost> getAllPostsByName(String companyName){

      return jobpostRepository.findAllByCompanyName(companyName);

        }

}
