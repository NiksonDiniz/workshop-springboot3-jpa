package com.ndiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndiniz.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
