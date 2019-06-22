package com.model;


public class Member {

    private int memberId;
    private String name;
    private String doa;
    private String gender;
    private String email;
    private String phoneNo;

    public Member(int memberId, String name, String doa, String gender, String email, String phoneNo) {
        this.memberId = memberId;
        this.name = name;
        this.doa = doa;
        this.gender = gender;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
