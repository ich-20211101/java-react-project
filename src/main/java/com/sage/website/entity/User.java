package com.sage.website.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "usersss")
@Data
public class User {
    // 사용자 엔티티 정의

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

}
