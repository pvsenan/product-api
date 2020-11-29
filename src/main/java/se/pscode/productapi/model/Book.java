package se.pscode.productapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "bookname")
    private String bookName;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "offerprice")
    private Double offerPrice;
    @Column(name = "enabledforsale")
    private Boolean enabledForSale;
    @Column(name = "imageurl")
    private String imageUrl;
}
