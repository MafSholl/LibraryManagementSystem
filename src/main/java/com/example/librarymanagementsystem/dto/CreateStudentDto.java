package com.example.librarymanagementsystem.dto;

import com.example.librarymanagementsystem.data.Book;
import com.example.librarymanagementsystem.data.enums.BorrowStatus;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateStudentDto {

    private String firstName;
    private String lastName;
    private String address;
    private BorrowStatus borrowingStatus;
    private List<Book> booksBorrowed;
}
