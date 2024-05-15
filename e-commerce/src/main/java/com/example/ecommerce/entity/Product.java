package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data //For Lombok
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //Tablo ilişkilerini kuruyoruz. @ManyToOne Ürünler  sadece 1 kategori ile  ilişkisi kurulur.
    //Yani bir ürün birden fazla category ile ilişkilendirilemez.
    //"category_id" alanı, "Product" tablosunda "ProductCategory" tablosuna bir referans oluşturur.
    // nullable = false: Bu alan boş olamaz.
    @ManyToOne
    @JoinColumn(name= "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "unit_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
