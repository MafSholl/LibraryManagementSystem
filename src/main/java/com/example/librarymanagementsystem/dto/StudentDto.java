package com.example.librarymanagementsystem.dto;

import com.example.librarymanagementsystem.data.Book;
import com.example.librarymanagementsystem.data.enums.BorrowStatus;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {

    private Long studentId;
    private String firstName;
    private String lastName;
    private String address;
    private BorrowStatus status;
    private List<Book> booksBorrowed;
    private boolean success;
}
