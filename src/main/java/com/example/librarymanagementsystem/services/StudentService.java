package com.example.librarymanagementsystem.services;

import com.example.librarymanagementsystem.dto.CreateStudentDto;
import com.example.librarymanagementsystem.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(CreateStudentDto createStudentRequest);
}
