package com.test.javatestsv.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="category",schema="testdb")
@NoArgsConstructor(force = true)
@Data
public class Category {
  @Id
  @Column(name="id")
  private long id;

  private String header;
  private String description;
  @Column(name="picture_name")
  private String pictureName;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getHeader() {
    return header;
  }

  public void setHeader(String header) {
    this.header = header;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getPictureName() {
    return pictureName;
  }

  public void setPictureName(String pictureName) {
    this.pictureName = pictureName;
  }

}
