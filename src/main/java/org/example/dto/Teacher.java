package org.example.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Teacher class
 *
 * @author Steven Hua
 */
@Getter
@Setter
public class Teacher {
    private String lname;
    private String fname;
    private Department department;
    private String id;
    private String name;

    private static int nextId = 1;

    public Teacher(String fname, String lname, Department department) {
        this.fname = fname;
        this.lname = lname;
        this.name = fname + " " + lname;
        this.department = department;
        this.id = String.format("T%03d", nextId++);
    }

    /**
     * prints teacher in desired format.
     *
     * @return returns teacher in desired format.
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", department=" + department.getDepartmentName() +
                '}';
    }
}
