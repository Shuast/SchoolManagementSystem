package org.example.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Student class
 *
 * @author Steven Hua
 */
@Getter
@Setter
public class Student {
    private String fname;
    private Course[] courses;
    private String id;
    private int courseNum;
    private String lname;
    private Department department;
    private String name;

    private static int nextId = 1;
    private static final int MAX_COURSE_NUM = 5;

    public Student(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.courses = new Course[MAX_COURSE_NUM];
        this.id = String.format("S%03d", nextId++);
        this.name = fname + " " + lname;
    }

    /**
     * prints course in desired format.
     *
     * @return returns course in desired format.
     */
    @Override
    public String toString() {
        String courseStr = "[";
        for (Course course : courses) {
            if (course != null) {
                courseStr += course.getCourseName() + ", ";
            }
        }
        return "Student{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department +
                ", courseNum=" + courseNum +
                ", courses=" + courseStr +
                "]}";
    }
}
