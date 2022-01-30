package com.test.javatestsv.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Document(collection = "categories")
@Data
public class Category {
  @Id
  private String id;
  private String header;
  private String description;
  private String pictureName;

}
