package com.om.projects.lovable_clone.entity;

import com.om.projects.lovable_clone.enums.MemberRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class ProjectMember {
    private ProjectMemberId id ;

    private MemberRole role ;

    private Long invitedBy ;
    private Instant invitedAt ;
}
