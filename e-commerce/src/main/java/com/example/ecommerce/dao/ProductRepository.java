package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    //Product: Entity Long: PrimaryKey
    // JpaRepository arayüzü,genellikle temel CRUD (Create, Read, Update, Delete)
    // işlemlerini gerçekleştirmek için kullanılır.



}
