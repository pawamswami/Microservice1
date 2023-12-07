package com.kotak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kotak.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
