package com.programming.simpleChatApplication.controller;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class chatMessage {

    private String content;
    private String Sender;
    private MessageType type;
}
