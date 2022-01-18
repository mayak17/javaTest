package com.test.javatestsv.DAO;

import com.test.javatestsv.HibernateConfiguration;
import com.test.javatestsv.entity.Category;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryDAO {

    @Autowired
    private HibernateConfiguration hibernateConfiguration;

    public List<Category> getAll() {
        Session session = hibernateConfiguration.getPostgresqlSession();
        List<Category> categoryList = (List<Category>)  session.createQuery("from Category ").list();
        session.close();
        return categoryList;
    }
}
