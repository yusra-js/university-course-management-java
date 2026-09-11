package com.company;

public class Staff {
    private String staffID;
    private String staffFName;
    private String staffLName;
    private String contactNumber;
    private String staffAddress;

    public Staff(String id, String fName, String lName, String contact, String address) {
        staffID = id;
        staffFName = fName;
        staffLName = lName;
        contactNumber = contact;
        staffAddress = address;
    }

    @Override
    public String toString() {
        return "Staff [staffID=" + staffID + ", staffFName=" + staffFName + ", staffLName=" + staffLName
                + ", contactNumber=" + contactNumber
                + ",staffAddress=" + staffAddress + "]";
    }

    public String getStaffID() { return staffID; }
    public void setStaffID(String staffID) { this.staffID = staffID; }
    public String getStaffFName() { return staffFName; }
    public void setStaffFName(String staffFName) { this.staffFName = staffFName; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getStaffAddress() { return staffAddress; }
    public void setStaffAddress(String staffAddress) { this.staffAddress = staffAddress; }
    public String getStaffLName() { return staffLName; }
    public void setStaffLName(String staffLName) { this.staffLName = staffLName; }
}
