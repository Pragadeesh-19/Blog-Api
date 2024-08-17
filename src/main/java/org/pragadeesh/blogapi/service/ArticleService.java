package org.pragadeesh.blogapi.service;

import org.apache.coyote.Response;
import org.pragadeesh.blogapi.model.Article;
import org.pragadeesh.blogapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ArticleService {

    public Article createArticle(Article article);

    public List<Article> allArticle();

    public Optional<Article> articleById(Long id);

    public Article updateArticleById(Long id, Article article);

    public void deleteArticleById(Long id);


}
