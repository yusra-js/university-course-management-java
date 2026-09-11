package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("1.Student\r\n"
                + "2.Lecturer\r\n"
                + "3.Administrator\r\n"
                + "4.Exit");
        int choice = 0;
        while (true) {
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 4)
                    System.out.println("Invalid choice!");
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static int adminMenu() {
        System.out.println("1.Allocate course\r\n"
                + "2.Drop course\r\n"
                + "3.Print a report\r\n");

        int choice = 0;
        while (true) {
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 0 || choice > 3)
                    System.out.println("Invalid choice!");
                return choice;
            } catch (Exception e) {
                System.out.println("Invalid choice!");
            }
        }
    }

    public static void displayStudent(ArrayList<Student> list) {
        String ID;
        System.out.print("Enter student ID: ");
        ID = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudentID().equals(ID)) {
                System.out.println(list.get(i));
                return;
            }
        }
    }

    public static void displayFaculty(ArrayList<Staff> staffList) {
        String ID;
        System.out.print("Enter faculty ID: ");
        ID = sc.nextLine();
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getStaffID().equals(ID)) {
                System.out.println(staffList.get(i));
                return;
            }
        }
    }

    public static void allocateCourse(ArrayList<Staff> staffList, ArrayList<Course> courseList) {
        String courseID;
        String lecturerID;
        System.out.println("Enter course ID: ");
        courseID = sc.nextLine();
        System.out.println("Enter lecturer ID: ");
        lecturerID = sc.nextLine();

        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getStaffID().equals(lecturerID))
            {
                for (int j = 0; j < courseList.size(); j++) {

                    if (courseList.get(j).getCourseCode().equals(courseID)) {
                        Object obj = staffList.get(i);
                        Teaching teaching = (Teaching)
                                obj;

                        teaching.addCourse(courseList.get(j));
                    }
                }
            }
        }
    }

    public static void dropCourse(ArrayList<Staff>
                                           staffList, ArrayList<Course> courseList) {
        String courseID;
        String lecturerID;
        System.out.println("Enter course ID: ");
        courseID = sc.nextLine();
        System.out.println("Enter lecturer ID: ");
        lecturerID = sc.nextLine();

        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getStaffID().equals(lecturerID))
            {
                for (int j = 0; j < courseList.size(); j++) {

                    if (courseList.get(j).getCourseCode().equals(courseID)) {
                        Object obj = staffList.get(i);
                        Teaching teaching = (Teaching)
                                obj;

                        teaching.dropCourse(courseID);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Staff> staffList = new ArrayList<Staff>();
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();
        int choice = 0;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    displayStudent(studentList);
                    break;
                case 2:
                    displayFaculty(staffList);
                    break;
                case 3:
                    choice = adminMenu();
                    switch (choice) {
                        case 1:
                            allocateCourse(staffList, courseList);
                            break;
                        case 2:
                            dropCourse(staffList, courseList);
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    break;
            }
        } while (choice != 4);
    }
}
