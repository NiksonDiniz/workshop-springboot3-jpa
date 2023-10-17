package com.ndiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndiniz.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
