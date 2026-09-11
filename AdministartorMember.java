package com.company;

public class AdministartorMember extends Staff{
    private String adminEmailID;
    private String adminSpecialization;

    public AdministartorMember(String id, String fName, String lName,
                                String contact, String address,
                                String adminEmailID, String adminSpecialization) {
        super(id, fName, lName, contact, address);
        this.adminEmailID = adminEmailID;
        this.adminSpecialization = adminSpecialization;
    }

    public String getAdminEmailID() { return adminEmailID; }
    public void setAdminEmailID(String adminEmailID) { this.adminEmailID = adminEmailID; }
    public String getAdminSpecialization() { return adminSpecialization; }
    public void setAdminSpecialization(String adminSpecialization) { this.adminSpecialization = adminSpecialization; }

    @Override
    public String toString() {
        return "AdministartorMember [adminEmailID=" + adminEmailID
                + ", adminSpecialization=" + adminSpecialization
                + ", toString()=" + super.toString()
                + ",getStaffID()=" + getStaffID() + ", getStaffFName()="
                + getStaffFName() + ", getContactNumber()=" +
                getContactNumber() + ", getStaffAddress()=" + getStaffAddress() + ", getStaffLName()=" +
                getStaffLName() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + "]";
    }
}
