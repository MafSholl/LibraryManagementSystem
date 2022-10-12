package com.example.librarymanagementsystem.services;

import com.example.librarymanagementsystem.data.Student;
import com.example.librarymanagementsystem.dto.CreateStudentDto;
import com.example.librarymanagementsystem.dto.StudentDto;
import com.example.librarymanagementsystem.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        CreateStudentDto createStudentRequest = new CreateStudentDto();
        studentService.createStudent(createStudentRequest);
    }

    @Test
    public void testThatStudentServiceWorks() {
        StudentService studentService = new StudentServiceImpl();
        assertThat(studentService).isNotNull();
    }

    @Test
    void testThatContextLoadsService() {
        assertThat(studentService).isNotNull();
    }

    @Test
    void testThatStudentCanBeCreated() {
        CreateStudentDto createStudentRequest = new CreateStudentDto();
        StudentDto createStudentResponse = studentService.createStudent(createStudentRequest);
        assertThat(createStudentResponse).isNotNull();
    }

    @Test
    void testThatStudentCanBePersisted() {
        Optional<Student> optionalStudent = studentRepository.findById(1L);
        assertThat(optionalStudent).isNotEmpty();
    }
}