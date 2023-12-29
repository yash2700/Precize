package com.SMS.Student.Management.System.repository;

import com.SMS.Student.Management.System.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends JpaRepository<Student, String> {
    @Query(value = "SELECT abc.Rank FROM (SELECT s.name AS student_name, ROW_NUMBER() OVER (ORDER BY s.satScore DESC) AS Rank FROM Student s) AS abc WHERE abc.student_name = :name")
    int findRankByName(@Param("name") String name);
}
