package service;

import model.Student;

import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> STUDENTS = new ArrayList<>();

    public void addStudent(Student student) {
        STUDENTS.add(student);
        System.out.println("\nStudent added successfully");
    }

    public void viewStudents() {

        if (STUDENTS.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        for (Student s : STUDENTS) {
            s.displayStudent();
        }
    }

    public void searchStudent(int id) {

        for (Student s : STUDENTS) {
            if (s.getId() == id) {
                s.displayStudent();
                return;
            }
        }

        System.out.println("Student not found");
    }

    public void deleteStudent(int id) {

        for (Student s : STUDENTS) {
            if (s.getId() == id) {
                STUDENTS.remove(s);
                System.out.println("\nStudent deleted");
                return;
            }
        }

        System.out.println("Student not found");
    }
}
