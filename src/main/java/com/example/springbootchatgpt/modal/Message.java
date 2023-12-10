package com.example.springbootchatgpt.modal;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {

    private String role;
    private String content;


}