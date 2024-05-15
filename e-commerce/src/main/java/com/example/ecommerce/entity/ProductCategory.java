package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "product_category")

//@Data
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    //OneToMany: Birçok ürünün tek bir kategory 'e ait olduğunu belirtir.
    //cascade = CascadeType.ALL: Kategory silindiğinde category 'e ait tüm bilgileri siler.
    //mappedBy = "category": Product 'a ilişkili kolon adı "category" olmalıdır.
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}
