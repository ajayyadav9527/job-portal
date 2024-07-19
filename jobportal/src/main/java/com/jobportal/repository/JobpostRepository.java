package com.jobportal.repository;

import com.jobportal.entity.Jobpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobpostRepository extends JpaRepository<Jobpost, Long> {

    List<Jobpost> findAllByCompanyName(String companyName);
}
