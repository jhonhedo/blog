package com.jhon.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jhon.blog.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
