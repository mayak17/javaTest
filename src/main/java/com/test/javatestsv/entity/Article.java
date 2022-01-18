package com.test.javatestsv.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="article")
@NoArgsConstructor(force = true)
@Data
public class Article {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;
  @Column(name="header_article")
  private String header_article;
  private String description;
  @Column(name="picture_name")
  private String picture_name;
  @Column(name="id_category")
  private long id_category;

}
