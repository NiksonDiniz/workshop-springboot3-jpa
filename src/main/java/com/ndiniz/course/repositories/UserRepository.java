package com.ndiniz.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ndiniz.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
