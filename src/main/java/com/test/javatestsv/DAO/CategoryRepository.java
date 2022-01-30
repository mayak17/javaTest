package com.test.javatestsv.DAO;

import com.test.javatestsv.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {

}
