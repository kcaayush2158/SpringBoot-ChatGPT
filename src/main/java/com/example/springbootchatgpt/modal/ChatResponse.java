package com.example.springbootchatgpt.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ChatResponse {

    private List<Choice> choices;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Choice {

        private int index;
        private Message message;

        // constructors, getters and setters
    }
}