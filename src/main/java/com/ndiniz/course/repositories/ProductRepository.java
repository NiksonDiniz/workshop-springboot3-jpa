package com.ndiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndiniz.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
