package com.example.librarymanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true ,nullable = false)
    private String email;

    private String country;

    @CreationTimestamp
    private Date addedOn;

    @OneToMany(mappedBy = "my_author") // you don't need to create a new column for booklist in the author table, just create a back reference
    @JsonIgnoreProperties("my_author")
    private List<Book> bookList;

}
