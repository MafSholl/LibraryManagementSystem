package com.example.librarymanagementsystem.data;

import com.example.librarymanagementsystem.data.enums.BorrowStatus;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Student {
    @Id private Long studentId;
    private String firstName;
    private String lastName;
    private String address;
    private BorrowStatus status;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "Student_Borrowed_Books",
            joinColumns = @JoinColumn(
                    name = "student_id", referencedColumnName = "studentId"),
            inverseJoinColumns = @JoinColumn(
                    name = "book_id", referencedColumnName = "bookId"
            )
    )
    private List<Book> booksBorrowed = new ArrayList<>();

//    @Builder()
//    public Student() {
//        booksBorrowed = new ArrayList<>();
//    }
}
