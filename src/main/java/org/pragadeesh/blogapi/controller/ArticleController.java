package org.pragadeesh.blogapi.controller;

import org.pragadeesh.blogapi.model.Article;
import org.pragadeesh.blogapi.service.ArticleService;
import org.pragadeesh.blogapi.service.ArticleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {

    private final ArticleServiceImp articleServiceImp;
    @Autowired
    public ArticleController(ArticleServiceImp articleServiceImp) {
        this.articleServiceImp = articleServiceImp;
    }

    @GetMapping()
    public List<Article> getAllArticle() {
        return articleServiceImp.allArticle();
    }

    @GetMapping("/{id}")
    public Optional<Article> articleById(@RequestParam Long id) {
        return articleServiceImp.articleById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<Article> createArticle(@RequestBody Article article) {
        Article createdArticle = articleServiceImp.createArticle(article);
        return ResponseEntity.ok(createdArticle);
    }

    @PutMapping("/update/{id}")
    public Article updateArticle(@RequestParam Long id,
                                     @RequestBody Article article) {
        return articleServiceImp.updateArticleById(id, article);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticle(@RequestParam Long id) {
        articleServiceImp.deleteArticleById(id);
    }
}
