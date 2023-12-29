package com.SMS.Student.Management.System.controller;

import com.SMS.Student.Management.System.ServiceImpl.StudentServiceImpl;
import com.SMS.Student.Management.System.model.StudentRequest;
import com.SMS.Student.Management.System.model.StudentResponse;
import com.SMS.Student.Management.System.model.UpdateRequest;
import jdk.jfr.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
//@CrossOrigin(origins = "http://lcoalhost:3001")
public class StudentController {
    @Autowired
    StudentServiceImpl service;

    @PostMapping(value = "/add",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentResponse> addStudent(@RequestBody() StudentRequest request){
        return new ResponseEntity<>(service.addStduent(request), HttpStatus.CREATED);
    }
    @GetMapping(value = "/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StudentResponse>> getAllStudents(){
        return new ResponseEntity<>(service.getAllStudents(),HttpStatus.OK);
    }
    @GetMapping(value = "/getRank/{name}")
    public ResponseEntity<Integer> getRank(@PathVariable("name") String name){
        return new ResponseEntity<>(service.getRank(name),HttpStatus.OK);
    }
    @DeleteMapping(value = "/delete/{name}")
    public ResponseEntity<String> deleteStudent(@PathVariable("name") String name){
        return new ResponseEntity<>(service.deleteStudent(name),HttpStatus.OK);
    }
    @PatchMapping(value = "/update",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StudentResponse> updateSatScore(@RequestBody UpdateRequest request){
        return new ResponseEntity<>(service.updateSatScore(request),HttpStatus.OK);
    }
}
