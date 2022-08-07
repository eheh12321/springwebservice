package com.example.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Entity 클래스와 "기본" Entity Repository는 항상 함께 위치하도록 한다
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
