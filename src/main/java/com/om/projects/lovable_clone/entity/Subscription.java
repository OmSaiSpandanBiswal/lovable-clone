package com.om.projects.lovable_clone.entity;

import com.om.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class Subscription {

    private Long id ;
    private User user ;
    private Plan plan ;

    private SubscriptionStatus status ;
    private String stripeSubscriptionId ;

    private Instant currentPeriodStart ;
    private Instant currentPeriodEnd ;
    private Boolean cancelAtPeriodEnd ;

    private Instant createdAt ;
    private Instant deletedAt ;
}
