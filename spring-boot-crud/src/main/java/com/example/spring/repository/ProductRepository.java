package com.example.spring.repository;
import com.example.spring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String Name);
}