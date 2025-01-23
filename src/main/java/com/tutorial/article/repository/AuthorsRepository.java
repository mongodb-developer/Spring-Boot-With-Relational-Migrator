package com.tutorial.article.repository;

import com.tutorial.article.entity.AuthorsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Generated by MongoDB Relational Migrator
 * https://www.mongodb.com/products/relational-migrator
 * Collection: authors
 * Language: Java
 * Template: Spring Data
 * Generated on 2025-01-22
 */
public interface AuthorsRepository extends MongoRepository<AuthorsEntity, String> {
}
