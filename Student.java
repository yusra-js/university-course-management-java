package com.company;

public class Student {
    private String studentID;
    private String studentName;
    private String studentEMail;
    private String studentContactNo;

    public Student(String id, String name, String email, String contact) {
        studentID = id;
        studentName = name;
        studentEMail = email;
        studentContactNo = contact;
    }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }
    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public String getStudentEMail() { return studentEMail; }
    public void setStudentEMail(String studentEMail) { this.studentEMail = studentEMail; }
    public String getStudentContactNo() { return studentContactNo; }
    public void setStudentContactNo(String studentContactNo) { this.studentContactNo = studentContactNo; }

    @Override
    public String toString() {
        return "student [studentID=" + studentID + ", studentName=" +
                studentName + ", studentEMail=" + studentEMail
                + ", studentContactNo=" + studentContactNo +
                "]";
    }
}
