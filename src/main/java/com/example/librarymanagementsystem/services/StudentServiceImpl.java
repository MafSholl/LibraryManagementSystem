package com.example.librarymanagementsystem.services;

import com.example.librarymanagementsystem.data.Student;
import com.example.librarymanagementsystem.dto.CreateStudentDto;
import com.example.librarymanagementsystem.dto.StudentDto;
import com.example.librarymanagementsystem.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public StudentDto createStudent(CreateStudentDto createStudentRequest) {
        Student student = modelMapper.map(createStudentRequest, Student.class);
        student.setStudentId(1L);
        student.setBooksBorrowed(new ArrayList<>());
        Student savedStudent = studentRepository.save(student);
        StudentDto studentDto = modelMapper.map(savedStudent, StudentDto.class);
        return studentDto;
    }
}
