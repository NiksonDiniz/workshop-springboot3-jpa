package com.ndiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndiniz.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
