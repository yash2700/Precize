package com.SMS.Student.Management.System.service;

import com.SMS.Student.Management.System.model.StudentRequest;
import com.SMS.Student.Management.System.model.StudentResponse;
import com.SMS.Student.Management.System.model.UpdateRequest;

import java.util.List;

public interface StudentService {
    StudentResponse addStduent(StudentRequest request);
    List<StudentResponse> getAllStudents();
    int getRank(String name);
    String deleteStudent(String name);
    StudentResponse updateSatScore(UpdateRequest request);
}
