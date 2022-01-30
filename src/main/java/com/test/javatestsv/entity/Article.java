package com.test.javatestsv.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "articles")
@Data
public class Article {
  @Id
  private String id;
  private String header;
  private String description;
  private String pictureName;
  private String categoryId;
}
