package com.test.javatestsv.services;

import com.test.javatestsv.DAO.CategoryDAO;
import com.test.javatestsv.DAO.CategoryRepository;
import com.test.javatestsv.entity.Category;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;

    public List<Category> getAllCategory(){
        return this.categoryRepository.findAll();
    }
}
