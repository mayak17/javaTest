package com.test.javatestsv.services;

import com.test.javatestsv.DAO.ArticleDAO;
import com.test.javatestsv.entity.Article;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ArticleService {

    private ArticleDAO articleDAO;

    public ArticleService(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    public List<Article> getAllArticles() {
            return this.articleDAO.getAll();
        }

    public Article getOneArticle(int id) throws NullPointerException {
        return this.articleDAO.getById(id);
    }

}
