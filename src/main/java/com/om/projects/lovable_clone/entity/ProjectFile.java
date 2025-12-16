package com.om.projects.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProjectFile {

    private Long id ;
    private Project project ;

    private String path ;
    private String minioObjectKey ;

    private Instant createdAt ;
    private Instant updatedAt ;

    private Long createdBy ;
    private Long updatedBy ;
}
