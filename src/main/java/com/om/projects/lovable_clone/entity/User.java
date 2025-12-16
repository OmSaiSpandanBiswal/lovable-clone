package com.om.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
public class User {
   private Long id ;
   private String email ;
   private String passwordHash ;
   private String name ;
   private String avtarUrl ;
   private Instant createdAt ;
   private Instant updatedAt ;
   private Instant deletedAt ; //for soft delete

}