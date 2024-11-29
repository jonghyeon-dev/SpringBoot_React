package com.src.reacttest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.reacttest.model.UserVO;

public interface UserRepository extends JpaRepository<UserVO,Long>{
    UserVO findByUserId(String userId);
}
