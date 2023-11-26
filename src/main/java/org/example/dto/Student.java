package org.example.dto;

/**
 * Student class
 *
 * @author Steven Hua
 */
public class Student {
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private String lname;
    private Department department;

    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;
}
