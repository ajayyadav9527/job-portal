package com.jobportal.dto;


import lombok.Data;

import java.util.Date;

@Data
public class JobpostDTO {
    private String jobRole;
    private String companyName;
    private String qualification;
    private String experience;
    private String salary;
    private String location;
    private Date postDate;
    private Date lastDate;
    private String description;
    private String jobUrl;
}

