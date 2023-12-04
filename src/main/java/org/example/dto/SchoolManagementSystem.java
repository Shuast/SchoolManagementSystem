package org.example.dto;

/**
 * Manages students, courses, departments and teachers
 *
 * @author Steven Hua
 */
public class SchoolManagementSystem {
    private static final int MAX_DEPARTMENT_NUM = 5;
    private int departmentNum = 0;
    private Department[] departments;
    private static final int MAX_STUDENT_NUM = 5;
    private int studentNum = 0;
    private Student[] students;
    private static final int MAX_TEACHER_NUM = 5;
    private int teacherNum = 0;
    private Teacher[] teachers;
    private static final int MAX_COURSE_NUM = 5;
    private int courseNum = 0;
    private Course[] courses;

    public SchoolManagementSystem(String name) {
        this.departments = new Department[MAX_DEPARTMENT_NUM];
        this.students = new Student[MAX_STUDENT_NUM];
        this.teachers = new Teacher[MAX_TEACHER_NUM];
        this.courses = new Course[MAX_COURSE_NUM];
    }

    /**
     * adds a department to the management system.
     *
     * @param departmentName name of the department.
     */
    public void addDepartment(String departmentName) {
        if (departmentNum < MAX_DEPARTMENT_NUM) {
            departments[departmentNum] = new Department(departmentName);
            departmentNum++;
            System.out.println("Added department " + departments[departmentNum - 1] + " successfully.");
        } else {
            System.out.printf("The amount of departments is already %d. Add department failed\n", MAX_DEPARTMENT_NUM);
        }
    }

    /**
     * adds a student to the management system
     *
     * @param fname        first name of the student.
     * @param lname        last name of the student.
     * @param departmentId id of the department that the student belongs to.
     */
    public void addStudent(String fname, String lname, String departmentId) {
        if (studentNum < MAX_STUDENT_NUM) {
            students[studentNum] = new Student(fname, lname, findDepartment(departmentId));
            studentNum++;
            System.out.println("Added student " + students[studentNum - 1] + " successfully.");
        } else {
            System.out.printf("The amount of students is already %d. Add student failed.\n", MAX_STUDENT_NUM);
        }
    }

    /**
     * adds a teacher to the management system.
     *
     * @param fname        first name of the teacher.
     * @param lname        last name of the teacher.
     * @param departmentId id of the department that the teacher belongs to.
     */
    public void addTeacher(String fname, String lname, String departmentId) {
        if (teacherNum < MAX_TEACHER_NUM) {
            teachers[teacherNum] = new Teacher(fname, lname, findDepartment(departmentId));
            teacherNum++;
            System.out.println("Added teacher " + teachers[teacherNum - 1] + " successfully.");
        } else {
            System.out.printf("The amount of teachers is already %d. Add teacher failed.\n", MAX_TEACHER_NUM);
        }
    }

    /**
     * adds a course to the management system.
     *
     * @param courseName   name of the course.
     * @param credit       amount of credits gained from the course.
     * @param departmentId id of the department that the course belongs to
     */
    public void addCourse(String courseName, double credit, String departmentId) {
        if (courseNum < MAX_COURSE_NUM) {
            courses[courseNum] = new Course(courseName, credit, findDepartment(departmentId));
            courseNum++;
            System.out.println("Added course " + courses[courseNum] + " successfully.");
        } else {
            System.out.printf("The amount of courses is already %d. Add course failed.\n", MAX_COURSE_NUM);
        }
    }

    /**
     * prints all departments in the management system.
     */
    public void printDepartments() {
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    /**
     * prints all students in the management system.
     */
    public void printStudents() {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     * prints all teachers in the management system.
     */
    public void printTeachers() {
        for (Teacher teacher : teachers) {
            if (teacher != null) {
                System.out.println(teacher);
            }
        }
    }

    /**
     * prints all courses in the management system.
     */
    public void printCourses() {
        for (Course course : courses) {
            if (course != null) {
                System.out.println(course);
            }
        }
    }

    /**
     * finds a department according to id provided.
     *
     * @param departmentId id of the department to search for.
     * @return returns the department if it exists else it returns null.
     */
    public Department findDepartment(String departmentId) {
        for (Department department : departments) {
            if (departmentId.equals(department.getId())) {
                return department;
            } else break;
        }
        return null;
    }

    /**
     * finds a student according to id provided.
     *
     * @param studentId id of the student to search for.
     * @return returns the student if it exists else it returns null.
     */
    public Student findStudent(String studentId) {
        for (Student student : students) {
            if (studentId.equals(student.getId())) {
                return student;
            } else break;
        }
        return null;
    }

    /**
     * finds a teacher according to id provided.
     *
     * @param teacherId id of the student to search for.
     * @return returns the teacher if it exists else it returns null.
     */
    public Teacher findTeacher(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacherId.equals(teacher.getId())) {
                return teacher;
            }
        }
        return null;
    }

    /**
     * finds a course according to id provided.
     *
     * @param courseId id of the student to search for.
     * @return returns the teacher if it exists else it returns null.
     */
    public Course findCourse(String courseId) {
        for (Course course : courses) {
            if (courseId.equals(course.getId())) {
                return course;
            } else break;
        }
        return null;
    }

    /**
     * assigns a teacher to a course with using id of teacher and id of course.
     *
     * @param teacherId id of teacher to assign to course.
     * @param courseId  if of course to assign teacher to.
     */
    public void modifyCourseTeacher(String teacherId, String courseId) {

    }

    /**
     * assigns a student to a course with using id of student and id of course.
     *
     * @param studentId id of student to assign to course.
     * @param courseId  id of course to assign teacher to.
     */
    public void registerCourse(String studentId, String courseId) {

    }
}
