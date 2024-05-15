package com.example.ecommerce.dao;

import com.example.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource: Bir entity sınıfının RESTful API'lerini tanımlamak için kullanılır.
//collectionResourceRel: API tarafından döndürülen koleksiyonların adıdır. Bu durumda, productCategory adı verilmiştir.

//path: API tarafından döndürülen kaynakların kök yoludur. Bu durumda, product-category olarak belirlenmiştir.

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

    //ProductCategory: Entity Long: PrimaryKey
}
