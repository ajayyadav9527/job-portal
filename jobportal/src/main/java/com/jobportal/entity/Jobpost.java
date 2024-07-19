package com.jobportal.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Jobpost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String jobRole;

    private String companyName;

    private String img;

    private String qualification;

    private String experience;

    private String salary;

    private String location;

    private Date postDate;

    private Date lastDate;

    @Column(length = 5000)
    private String description;

    private String jobUrl;


    private int likeCount;

    private int viewCount;


}
