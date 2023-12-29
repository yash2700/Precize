package com.SMS.Student.Management.System.model;

public class UpdateRequest {
    private String name;
    private double satScore;

    @Override
    public String toString() {
        return "UpdateRequest{" +
                "name='" + name + '\'' +
                ", satScore='" + satScore + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSatScore() {
        return satScore;
    }

    public void setSatScore(double satScore) {
        this.satScore = satScore;
    }

    public UpdateRequest() {
    }

    public UpdateRequest(String name, double satScore) {
        this.name = name;
        this.satScore = satScore;
    }
}
