package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class InputData {

    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
