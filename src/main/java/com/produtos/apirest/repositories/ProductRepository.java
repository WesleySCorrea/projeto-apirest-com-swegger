package com.produtos.apirest.repositories;

import com.produtos.apirest.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
