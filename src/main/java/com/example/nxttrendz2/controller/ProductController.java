/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz2.controller;

import com.example.nxttrendz2.model.Product;
import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.service.ProductJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class ProductController {
    @Autowired
    public ProductJpaService productJpaService;

    @GetMapping("products/{productId}/categories")
    public Category getProductcategory(@PathVariable("id") int id){
        return productJpaService.getProductCategory(id);
    }

    @GetMapping("/categories/products")
    public ArrayList<Product> getProducts() {
        return productJpaService.getProducts();
    }

    @PostMapping("/categories/products")
    public Product addProduct(@RequestBody Product product) {
        return productJpaService.addProduct(product);
    }

    @GetMapping("/categories/products/{id}")
    public Product getProduct(@PathVariable("id") int id) {
        return productJpaService.getProduct(id);
    }

    @PutMapping("/categories/products/{productId}")
    public Product updateProduct(@PathVariable("id") int id, @RequestBody Product product) {
        return productJpaService.updateProduct(id, product);
    }

    @DeleteMapping("/categories/products/{productId}")
    public void deleteProduct(@PathVariable("id") int id) {
        productJpaService.deleteProduct(id);
    }
}}}