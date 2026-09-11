package com.company;

public class FacultyMember extends Staff{
    private String academicRank;
    private String emailID;
    private String academicSpecialization;

    public FacultyMember(String id, String fName, String lName, String
            contact, String address, String academicRank,
                          String emailID, String academicSpecialization) {
        super(id, fName, lName, contact, address);
        this.academicRank = academicRank;
        this.emailID = emailID;
        this.academicSpecialization = academicSpecialization;
    }

    public String getEmailID() { return emailID; }
    public void setEmailID(String emailID) { this.emailID = emailID; }
    public String getAcademicSpecialization() { return academicSpecialization; }
    public void setAcademicSpecialization(String academicSpecialization)
    {
        this.academicSpecialization = academicSpecialization;
    }
    public String getAcademicRank() { return academicRank; }
    public void setAcademicRank(String academicRank) { this.academicRank = academicRank; }

    @Override
    public String toString() {
        return "FacultyMember [academicRank=" + academicRank + ",emailID=" + emailID + ", academicSpecialization="
                + academicSpecialization + ", toString()=" +
                super.toString() + ", getStaffID()=" + getStaffID() + ", getStaffFName()=" + getStaffFName()
                + ",getContactNumber()=" + getContactNumber()
                + ", getStaffAddress()=" + getStaffAddress()
                + ", getStaffLName()=" + getStaffLName() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
