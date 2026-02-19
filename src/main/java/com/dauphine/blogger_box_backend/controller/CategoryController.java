package com.dauphine.blogger_box_backend.controller;

import com.dauphine.blogger_box_backend.entities.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    private final List<Category> temporaryCategories = new ArrayList<>();
}
