package com.tutorial.article.entity;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.annotation.Generated;

/**
 * Generated by MongoDB Relational Migrator
 * https://www.mongodb.com/products/relational-migrator
 * Collection: reviews
 * Language: Java
 * Template: Spring Data
 * Generated on 2025-01-22
 */
@JsonTypeName("reviews__id")
@Generated(value = "com.mongodb.migrator.application.codegen.config.java.JavaSpringCodegenConfig", date = "2025-01-22T20:18:00.177805+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")@Document("reviews__id")
public class ReviewsIdEntity {

  @BsonProperty("bookId")
  private String bookId;

  @BsonProperty("userId")
  private Integer userId;

  public ReviewsIdEntity bookId(String bookId) {
    this.bookId = bookId;
    return this;
  }

  /**
   * Get bookId
   * @return bookId
   */
  
  @JsonProperty("bookId")
  public String getBookId() {
    return bookId;
  }

  public void setBookId(String bookId) {
    this.bookId = bookId;
  }

  public ReviewsIdEntity userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   */
  
  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewsIdEntity reviewsId = (ReviewsIdEntity) o;
    return Objects.equals(this.bookId, reviewsId.bookId) &&
        Objects.equals(this.userId, reviewsId.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewsIdEntity {\n");
    sb.append("    bookId: ").append(toIndentedString(bookId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

