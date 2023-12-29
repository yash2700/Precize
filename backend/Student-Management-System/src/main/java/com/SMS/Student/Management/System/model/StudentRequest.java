package com.SMS.Student.Management.System.model;

import com.SMS.Student.Management.System.entity.Student;

public class StudentRequest {
    private String name;
    private String address;
    private String city;
    private String country;
    private long pincode;
    private double satScore;
    public StudentRequest() {
    }

    public StudentRequest(String name, String address, String city, String country, long pincode, double satScore) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.pincode = pincode;
        this.satScore = satScore;
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



    public static Student mapToEntity(StudentRequest request){
        Student student=new Student();
        student.setName(request.getName());
        student.setAddress(request.getAddress());
        student.setCity(request.getCity());
        student.setCountry(request.getCountry());
        student.setPinCode(request.getPincode());
        student.setSatScore(request.getSatScore());
        student.setPassed(request.getSatScore()>30?"Passed":"Fail");
        return student;
    }
}
