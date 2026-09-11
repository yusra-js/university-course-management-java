package com.company;

import java.util.ArrayList;

public class Teaching extends FacultyMember {
    private ArrayList<Course> courses = new ArrayList<Course>();

    public Teaching(String id, String fName, String lName, String contact, String address, String academicRank,
                     String emailID, String academicSpecialization) {
        super(id, fName, lName, contact, address, academicRank, emailID, academicSpecialization);
    }

    public void addCourse(Course e) { courses.add(e); }

    public void dropCourse(String courseCode) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseCode().equals(courseCode))
            {
                courses.remove(i);

                return;
            }

        }
    }

    @Override
    public String toString() {
        return "Teaching [ getEmailID()=" + getEmailID()
                + ", getAcademicSpecialization()="
                + getAcademicSpecialization()
                + ", getAcademicRank()="
                + getAcademicRank()
                + ", toString()="
                + super.toString() + ", getStaffID()=" + getStaffID()
                + ", getStaffFName()=" + getStaffFName()
                + ",getContactNumber()=" + getContactNumber()
                + ", getStaffAddress()=" + getStaffAddress()
                + ", getStaffLName()=" + getStaffLName() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
