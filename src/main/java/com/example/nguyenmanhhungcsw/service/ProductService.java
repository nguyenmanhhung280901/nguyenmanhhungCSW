package com.example.nguyenmanhhungcsw.service;

import com.example.nguyenmanhhungcsw.entity.ProductEntity;
import com.example.nguyenmanhhungcsw.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService{
    @Autowired
    private ProductRepo productRepo;

    @Override
    public Iterable<ProductEntity> findAll() {
        return productRepo.findAll();
    }

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return productRepo.findById(id);
    }

    @Override
    public ProductEntity save(ProductEntity product) {
        return productRepo.save(product);
    }

}
