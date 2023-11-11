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

import com.example.nxttrendz2.model.Category;
import com.example.nxttrendz2.service.CategoryJpaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class CategoryController {
    @Autowired
    public CategoryJpaService categoryJpaService;

    @GetMapping("/categories")
    public ArrayList<Category> getCategories() {
        return categoryJpaService.getCategories();
    }

    @PostMapping("/categories")
    public Category addCategory(@RequestBody Category category) {
        return categoryJpaService.addCategory(category);
    }

    @GetMapping("/categories/{categoryId}")
    public Category getCategory(@PathVariable("id") int id) {
        return categoryJpaService.getCategory(id);
    }

    @PutMapping("/categories/{categoryId}")
    public Category updateCategory(@PathVariable("id") int id, @RequestBody Category category) {
        return categoryJpaService.updateCategory(id, category);
    }

    @DeleteMapping("/categories/{categoryId}")
    public void deleteCategory(@PathVariable("id") int id) {
        categoryJpaService.deleteCategory(id);
    }
}