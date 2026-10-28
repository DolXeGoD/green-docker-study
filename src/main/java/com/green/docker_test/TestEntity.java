package com.green.docker_test;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "docker_test_tbl")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "content", nullable = false)
    private String content;
}
