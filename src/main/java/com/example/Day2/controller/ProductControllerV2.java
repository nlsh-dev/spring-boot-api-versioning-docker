package com.example.Day2.controller;


import com.example.Day2.entity.Product;
import com.example.Day2.repository.ProductRepository;
import com.example.Day2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/products")
public class ProductControllerV2 {




    @Autowired
    private  ProductService productService;


    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product prroduct){

        Product createProduct  = productService.createProduct(prroduct);

        return  new ResponseEntity<>(createProduct, HttpStatus.CREATED);

    }



    @GetMapping
    public ResponseEntity<List<Product>>  getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return  ResponseEntity.ok(products);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id){
        Product products = productService.getProductById(id);
        return  ResponseEntity.ok(products);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {

        Product updatedProduct = productService.updateProduct(id, product);
        return ResponseEntity.ok(updatedProduct);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.ok(
                "Product deleted successfully with id: " + id
        );
    }





}
