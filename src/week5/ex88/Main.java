package week5.ex88;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newStudent = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("name: ");
            String name = newStudent.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String studentNumber = newStudent.nextLine();

            Student student = new Student(name, studentNumber);
            students.add(student);
        }
        System.out.println("list of students: ");

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Give search term: ");
        String term = newStudent.nextLine();
        System.out.println("Results: ");
        for (Student student : students) {
            if (student.getName().contains(term)) {
                System.out.println(student);
            }
        }
    }
}
