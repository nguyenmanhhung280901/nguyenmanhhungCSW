package com.example.nguyenmanhhungcsw.repository;

import com.example.nguyenmanhhungcsw.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductEntity, Long> {
}
