package com.sage.website.repository;

import com.sage.website.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA가 기본적인 CRUD 작업을 자동으로 구현
}
