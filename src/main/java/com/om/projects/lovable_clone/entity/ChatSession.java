package com.om.projects.lovable_clone.entity;

import lombok.Getter;
import lombok.Setter;
import java.time.Instant;


@Getter
@Setter
public class ChatSession {

    private Long id ;

    private Project project ;
    private User user ;

    private String title ;

    private Instant createdAt ;
    private Instant updatedAt ;
    private Instant deletedAt ; //for soft delete
}
