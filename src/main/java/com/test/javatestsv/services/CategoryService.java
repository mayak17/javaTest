package com.test.javatestsv.services;

import com.test.javatestsv.DAO.CategoryDAO;
import com.test.javatestsv.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;
    public List<Category> getAllCategory(){
        return this.categoryDAO.getAll();
    }
}
