package org.example;

import org.example.dto.SchoolManagementSystem;

/**
 * @author Steven Hua
 */
public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem college = new SchoolManagementSystem("Year 2023");

        college.addDepartment("Humanities");
        college.addStudent("Lana", "Mali", "D001");
        college.addTeacher("Malio", " Robinson", "D001");
        college.addCourse("Ethics", 1.5, "D001");
        college.printDepartments();
        college.printStudents();
        college.printTeachers();
        college.printCourses();
        college.findDepartment("D001");
        college.findStudent("S001");
        college.findTeacher("T001");
        college.findCourse("C001");
        college.modifyCourseTeacher("T001", "C001");
        college.registerCourse("S001", "C001");
    }
}