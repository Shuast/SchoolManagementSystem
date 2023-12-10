package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Department class
 *
 * @author Steven Hua
 */
@Getter
@Setter
@ToString
public class Department {
    private String id;
    private String departmentName;

    private static int nextId = 1;

    public Department(String departmentName) {
        this.id = String.format("D%03d", nextId++);
        this.departmentName = departmentName;
    }
}
