package mate.academy.springbootweb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private double price;
    private String description;
    private String coverImage;
}
