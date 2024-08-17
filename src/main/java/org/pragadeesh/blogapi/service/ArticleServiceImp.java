package org.pragadeesh.blogapi.service;

import org.pragadeesh.blogapi.model.Article;
import org.pragadeesh.blogapi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService {

    private final ArticleRepository articleRepository;
    @Autowired
    public ArticleServiceImp(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


    @Override
    public Article createArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> allArticle() {
        return articleRepository.findAll();
    }

    @Override
    public Optional<Article> articleById(Long id) {
        return articleRepository.findById(id);
    }


    @Override
    public Article updateArticleById(Long id, Article article) {
        Article existingArticle = articleRepository.findById(id).orElseThrow(() -> new RuntimeException("Article not found"));
        existingArticle.setTitle(article.getTitle());
        existingArticle.setContent(article.getContent());
        existingArticle.setAuthor(article.getAuthor());
        existingArticle.setTags(article.getTags());

        return articleRepository.save(existingArticle);

    }

    @Override
    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }
}
