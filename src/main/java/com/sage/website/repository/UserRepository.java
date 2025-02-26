package com.sage.website.repository;

import com.sage.website.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA가 기본적인 CRUD 작업을 자동으로 구현

    // Optional<>: 값이 있을 수도 있고 없을 수도 있는 경우를 안전하게 처리
    Optional<User> findByEmail(String email);
}
