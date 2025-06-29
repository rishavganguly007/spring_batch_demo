package com.appledore.spring_batch_demo.config;

import com.appledore.spring_batch_demo.model.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {

    @Override
    public Student process(Student student) {

        // all the business logic goes here
        return student;
    }
}