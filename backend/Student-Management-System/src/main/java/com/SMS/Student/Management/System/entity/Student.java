package com.SMS.Student.Management.System.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "NAME", unique = true)
    private String name;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "PINCODE")
    private long pinCode;
    @Column(name = "SATSCORE")
    private double satScore;
    @Column(name = "PASSED")
    private String passed;

    public Student() {
    }

    public Student(String name, String address, String city, String country, long pinCode, double satScore, String passed) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
        this.satScore = satScore;
        this.passed = passed;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", city='" + city + '\'' + ", country='" + country + '\'' + ", pinCode=" + pinCode + ", satScore=" + satScore + ", passed='" + passed + '\'' + '}';
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

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
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
}
