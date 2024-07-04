package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class QueryDslConfig {
	
	private final EntityManager entityManager;
	
    @Bean
    public JPAQueryFactory jpaQueryFactory() {
    	return new JPAQueryFactory(entityManager);
    }
}
