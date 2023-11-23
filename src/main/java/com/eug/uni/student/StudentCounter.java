package com.eug.uni.student;

public class StudentCounter {
    private long studentCounter = 0;

    public StudentCounter(StudentRepository repository){
        this.studentCounter = repository.count();
        System.out.println("Count is " + studentCounter);
    }
}
