package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 1;
    private String name = "Ananya";

    @Autowired
    private Certification certification;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name +
               ", certification=" + certification + "]";
    }
}
