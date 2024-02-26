package com.projects.spring.springboot.repositories;

import com.projects.spring.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductModel, UUID> {



}
