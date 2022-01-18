package com.test.javatestsv.DAO;

import com.test.javatestsv.HibernateConfiguration;
import com.test.javatestsv.entity.Article;
import com.test.javatestsv.entity.Category;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ArticleDAO {

    private HibernateConfiguration hibernateConfiguration;

    public ArticleDAO(HibernateConfiguration hibernateConfiguration) {
        this.hibernateConfiguration = hibernateConfiguration;
    }

    public List<Article> getAll() {
        Session session = hibernateConfiguration.getPostgresqlSession();
        List<Article> articleList = (List<Article>)  session.createQuery("from Article").list();
        session.close();
        return articleList;
    }

    public Article getById(int id) {
        Session session = hibernateConfiguration.getPostgresqlSession();
        Article result = session.get(Article.class,(long)id);
        session.close();
        return result;
    }
}
