package org.example.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * Course class
 *
 * @author Steven Hua
 */
@Getter
@Setter
@EqualsAndHashCode
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

    public Course(String courseName, double credit, Department department) {
        this.courseName = courseName;
        this.credit = credit;
        this.department = department;
        this.id = String.format("C%03d", nextId++);
        this.students = new Student[MAX_STUDENT_NUM];
    }

    /**
     * prints student in desired format.
     *
     * @return returns student in desired format.
     */
    @Override
    public String toString() {
        String studentStr = "[";
        for (Student student : students) {
            if (student != null) {
                studentStr += student + ", ";
            }
        }
        return "Course{" +
                ", id='" + id + '\'' +
                ", courseName='" + courseName + '\'' +
                "credit=" + credit +
                ", teacher=" + teacher +
                ", department=" + department.getDepartmentName() +
                ", students=" + studentStr +
                '}';
    }
}
