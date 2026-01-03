package mate.academy.springbootweb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;

    @ToString.Exclude
    @Column(name = "isbn", unique = true)
    private String isbn;

    private double price;
    private String description;
    private String coverImage;
}
