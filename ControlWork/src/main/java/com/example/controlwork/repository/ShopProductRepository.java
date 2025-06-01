package com.example.controlwork.repository;

import com.example.controlwork.model.ShopProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopProductRepository extends JpaRepository<ShopProduct, Long> {
}