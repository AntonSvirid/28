package by.itstep.antonsvirid.controller;

import by.itstep.antonsvirid.model.entity.Student;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        try {
            student.setAge(-10);
        } catch (Exception exc) {
            System.out.println("Data error");
        }


    }
}
