package com.ua.robotles39.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {

    private String name;
    private int age;
    private String address;
}