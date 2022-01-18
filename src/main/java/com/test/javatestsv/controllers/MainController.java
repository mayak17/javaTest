package com.test.javatestsv.controllers;

import com.test.javatestsv.entity.Article;
import com.test.javatestsv.entity.Category;
import com.test.javatestsv.services.ArticleService;
import com.test.javatestsv.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.List;

@Controller
public class MainController {

    private final CategoryService categoryService;
    private final ArticleService articleService;

    public MainController(CategoryService categoryService, ArticleService articleService) {
        this.categoryService = categoryService;
        this.articleService = articleService;
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> getAllCategory(){
        List<Category> allCategory = this.categoryService.getAllCategory();
        return ResponseEntity.ok(allCategory);
    }
    @GetMapping("/article")
    public ResponseEntity<List<Article>> getAllArticle(){
        List<Article> allArticles = this.articleService.getAllArticles();
        return ResponseEntity.ok(allArticles);
    }
    @GetMapping("/article/{id}")
    public ResponseEntity<Article> getOneArticleById(@PathVariable int id){
        try {
            Article result = this.articleService.getOneArticle(id);
            return ResponseEntity.ok(result);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
