package com.example.nguyenmanhhungcsw.entity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String stockName;

    @Column(name = "price", nullable = false)
    private Double stockPrice;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    public ProductEntity() {
    }

    public ProductEntity(String stockName, Double stockPrice, Integer quantity) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
