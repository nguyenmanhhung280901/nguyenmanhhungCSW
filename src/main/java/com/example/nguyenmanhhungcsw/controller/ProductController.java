package com.example.nguyenmanhhungcsw.controller;

import com.example.nguyenmanhhungcsw.entity.ProductEntity;
import com.example.nguyenmanhhungcsw.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private IProductService iProductService;

    // Add New Products
    @PostMapping
    public ResponseEntity<ProductEntity> createNewProduct(@RequestBody ProductEntity product) {
        return new ResponseEntity<>(iProductService.save(product), HttpStatus.OK);
    }

    // Get All Products
    @GetMapping
    public ResponseEntity<Iterable<ProductEntity>> getAllProducts() {
        return new ResponseEntity<>(iProductService.findAll(), HttpStatus.OK);
    }

    // Get 1 Product ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProduct(@PathVariable Long id) {
        Optional<ProductEntity> productOptional = iProductService.findById(id);
        return productOptional.map(product -> new ResponseEntity<>(product, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
