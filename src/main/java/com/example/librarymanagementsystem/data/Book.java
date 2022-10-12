package com.example.librarymanagementsystem.data;

import com.example.librarymanagementsystem.data.enums.BookType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private Long bookId;
    private String title;
    private BookType bookType;
    private String author;
    private int bookCount;
    private LocalDateTime dateBorrowed;
    private LocalDateTime dateToBeReturned;
    @ManyToMany
    private List<Student> borrowers;
}