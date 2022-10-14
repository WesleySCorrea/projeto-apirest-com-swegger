package com.produtos.apirest.resources;

import com.produtos.apirest.models.Product;
import com.produtos.apirest.repositories.ProductRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Products")
@CrossOrigin(origins = "*")
public class ProductResource {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/products")
    @ApiOperation(value = "Retorna uma lista de produtos")
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/products/{id}")
    @ApiOperation(value = "Retorna um produto especifico")
    public Product findById(@PathVariable Long id) {
        return productRepository.findById(id).get();
    }

    @PostMapping(value = "/product")
    @ApiOperation(value = "Salva um produto")
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @DeleteMapping(value = "/product")
    @ApiOperation(value = "Deleta um produto")
    public void deleteProduct(@RequestBody Product product) {
        productRepository.delete(product);
    }

    @PutMapping(value = "/product")
    @ApiOperation(value = "Atualiza um produto")
    public Product productUpdate(@RequestBody Product product) {
        return productRepository.save(product);
    }
}