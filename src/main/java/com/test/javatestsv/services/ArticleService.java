package com.test.javatestsv.services;

import com.test.javatestsv.DAO.ArticleDAO;
import com.test.javatestsv.DAO.ArticleRepository;
import com.test.javatestsv.entity.Article;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ArticleService {

    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
            return this.articleRepository.findAll();
        }

    public Optional<Article> getOneArticle(String id) {
        return this.articleRepository.findById(id);
    }

}
