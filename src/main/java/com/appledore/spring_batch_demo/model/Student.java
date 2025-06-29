package com.appledore.spring_batch_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student {

    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String age;

}
