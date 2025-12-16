package com.om.projects.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Project {

    private Long id ;
    private String name ;
    private String description ;

    private User user ;
    private Boolean isPublic ;

    private Instant createdAt ;
    private Instant updatedAt ;
    private Instant deletedAt ;
}
