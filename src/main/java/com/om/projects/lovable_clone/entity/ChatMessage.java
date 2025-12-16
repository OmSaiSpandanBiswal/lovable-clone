package com.om.projects.lovable_clone.entity;

import com.om.projects.lovable_clone.enums.MessageRole;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;


@Getter
@Setter
public class ChatMessage {
    private Long id ;
    private ChatSession session ;

    private MessageRole role ;

    private String toolCalls ; // JSON Array of Tools Called
    private String content ;

    private Integer tokenUsed ;
    private Instant createdAt ;
}
