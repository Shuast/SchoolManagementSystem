package org.example.dto;

/**
 * Course class
 *
 * @author Steven Hua
 */
public class Course {
    private double credit;
    private String id;
    private Student[] students;
    private Department department;
    private int studentNum;
    private Teacher teacher;
    private String courseName;

    private static int nextId = 1;
    private static final int MAX_STUDENT_NUM = 5;
}
