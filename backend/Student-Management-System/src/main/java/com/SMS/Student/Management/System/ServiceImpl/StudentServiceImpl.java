package com.SMS.Student.Management.System.ServiceImpl;

import com.SMS.Student.Management.System.entity.Student;
import com.SMS.Student.Management.System.model.StudentRequest;
import com.SMS.Student.Management.System.model.StudentResponse;
import com.SMS.Student.Management.System.model.UpdateRequest;
import com.SMS.Student.Management.System.repository.StudentRepository;
import com.SMS.Student.Management.System.service.StudentService;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    StudentRepository repository;
    @Autowired
    EntityManager manager;

    @Override
    public StudentResponse addStduent(StudentRequest request) {
        Student student = StudentRequest.mapToEntity(request);
        repository.save(student);
        logger.info("New Student saved into db with details :" + student);
        return StudentResponse.mapToResponse(student);
    }

    @Override
    public List<StudentResponse> getAllStudents() {
        List<StudentResponse> response = new ArrayList<>();
        List<Student> studentList = repository.findAll();
        response = studentList.stream().map(StudentResponse::mapToResponse).collect(Collectors.toList());

        logger.info("Getting all Students :" + response);
        return response;
    }

    @Override
    public int getRank(String name) {
        if (repository.existsById(name)) {
            logger.info("Student successfully found with name :" + name);
            return repository.findRankByName(name);
        } else {
            logger.error("Not able to find Student with name :" + name);
            return -1;
        }
    }

    @Override
    public String deleteStudent(String name) {
        if (repository.existsById(name)) {
            repository.deleteById(name);
            logger.info("Student successfully deleted with name :" + name);
        } else {
            logger.error("Not able to find Student with name :" + name);
            return "Failure";
        }
        return "Success";
    }

    @Override
    public StudentResponse updateSatScore(UpdateRequest request) {
        Student student;
        if (repository.existsById(request.getName())) {
            student = repository.findById(request.getName()).get();
        } else {
            logger.error("Not able to find Student with name :" + request.getName());
            return new StudentResponse();
        }
        student.setSatScore(request.getSatScore());
        student.setPassed(request.getSatScore()>=30?"Passed":"Fail");
        repository.save(student);
        logger.info("Student's sat score successfully updated :" + student);
        return StudentResponse.mapToResponse(student);
    }
}
