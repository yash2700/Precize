package com.SMS.Student.Management.System.model;

import com.SMS.Student.Management.System.entity.Student;

public class StudentResponse {
    private String name;
    private String address;
    private String city;
    private String country;
    private long pincode;
    private double satScore;
    private String passed;

    public StudentResponse() {
    }

    public StudentResponse(String name, String address, String city, String country, long pincode, double satScore, String passed) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.pincode = pincode;
        this.satScore = satScore;
        this.passed = passed;
    }

    @Override
    public String toString() {
        return "StudentRequest{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", pincode=" + pincode +
                ", satScore=" + satScore +
                ", passed='" + passed + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public double getSatScore() {
        return satScore;
    }

    public void setSatScore(double satScore) {
        this.satScore = satScore;
    }

    public String getPassed() {
        return passed;
    }

    public void setPassed(String passed) {
        this.passed = passed;
    }
    public static StudentResponse mapToResponse(Student student){
        StudentResponse response=new StudentResponse();
        response.setAddress(student.getAddress());
        response.setCity(student.getCity());
        response.setCountry(student.getCountry());
        response.setName(student.getName());
        response.setPincode(student.getPinCode());
        response.setSatScore(student.getSatScore());
        response.setPassed(student.getPassed());
        return  response;
    }
}
