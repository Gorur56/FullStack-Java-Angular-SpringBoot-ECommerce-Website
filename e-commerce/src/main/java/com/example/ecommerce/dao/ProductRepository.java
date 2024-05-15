package com.example.ecommerce.dao;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //Product: Entity Long: PrimaryKey
    // JpaRepository arayüzü,genellikle temel CRUD (Create, Read, Update, Delete)
    // işlemlerini gerçekleştirmek için kullanılır.



}
