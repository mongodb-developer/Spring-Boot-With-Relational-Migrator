package com.tutorial.article.entity;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.*;
import javax.annotation.Generated;

/**
 * Generated by MongoDB Relational Migrator
 * https://www.mongodb.com/products/relational-migrator
 * Collection: books
 * Language: Java
 * Template: Spring Data
 * Generated on 2025-01-22
 */
@JsonTypeName("books")
@Generated(value = "com.mongodb.migrator.application.codegen.config.java.JavaSpringCodegenConfig", date = "2025-01-22T20:18:00.059561+05:30[Asia/Kolkata]", comments = "Generator version: 7.9.0")@Document("books")
public class BooksEntity {

  @BsonProperty("_id")
  private String id;

  @BsonProperty("title")
  private String title;

  @BsonProperty("pages")
  private Integer pages;

  @BsonProperty("year")
  private Integer year;

  @BsonProperty("synopsis")
  private String synopsis;

  @BsonProperty("cover")
  private String cover;

  @BsonProperty("totalInventory")
  private Integer totalInventory;

  @BsonProperty("available")
  private Integer available;

  @BsonProperty("binding")
  private String binding;

  @BsonProperty("language")
  private String language;

  @BsonProperty("publisher")
  private String publisher;

  @BsonProperty("longTitle")
  private String longTitle;

  @BsonProperty("bookOfTheMonth")
  private Boolean bookOfTheMonth;

  @BsonProperty("genres")
  
  private List<String> genres = new ArrayList<>();

  @BsonProperty("attributes")
  
  private List<@Valid BooksAttributesInnerEntity> attributes = new ArrayList<>();

  @BsonProperty("authorBooks")
  
  private List<@Valid BooksAuthorBooksInnerEntity> authorBooks = new ArrayList<>();

  @BsonProperty("reviews")
  
  private List<@Valid BooksReviewsInnerEntity> reviews = new ArrayList<>();

  public BooksEntity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BooksEntity title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public BooksEntity pages(Integer pages) {
    this.pages = pages;
    return this;
  }

  /**
   * Get pages
   * @return pages
   */
  
  @JsonProperty("pages")
  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public BooksEntity year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
   */
  
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public BooksEntity synopsis(String synopsis) {
    this.synopsis = synopsis;
    return this;
  }

  /**
   * Get synopsis
   * @return synopsis
   */
  
  @JsonProperty("synopsis")
  public String getSynopsis() {
    return synopsis;
  }

  public void setSynopsis(String synopsis) {
    this.synopsis = synopsis;
  }

  public BooksEntity cover(String cover) {
    this.cover = cover;
    return this;
  }

  /**
   * Get cover
   * @return cover
   */
  
  @JsonProperty("cover")
  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public BooksEntity totalInventory(Integer totalInventory) {
    this.totalInventory = totalInventory;
    return this;
  }

  /**
   * Get totalInventory
   * @return totalInventory
   */
  
  @JsonProperty("totalInventory")
  public Integer getTotalInventory() {
    return totalInventory;
  }

  public void setTotalInventory(Integer totalInventory) {
    this.totalInventory = totalInventory;
  }

  public BooksEntity available(Integer available) {
    this.available = available;
    return this;
  }

  /**
   * Get available
   * @return available
   */
  
  @JsonProperty("available")
  public Integer getAvailable() {
    return available;
  }

  public void setAvailable(Integer available) {
    this.available = available;
  }

  public BooksEntity binding(String binding) {
    this.binding = binding;
    return this;
  }

  /**
   * Get binding
   * @return binding
   */
  
  @JsonProperty("binding")
  public String getBinding() {
    return binding;
  }

  public void setBinding(String binding) {
    this.binding = binding;
  }

  public BooksEntity language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public BooksEntity publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

  /**
   * Get publisher
   * @return publisher
   */
  
  @JsonProperty("publisher")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public BooksEntity longTitle(String longTitle) {
    this.longTitle = longTitle;
    return this;
  }

  /**
   * Get longTitle
   * @return longTitle
   */
  
  @JsonProperty("longTitle")
  public String getLongTitle() {
    return longTitle;
  }

  public void setLongTitle(String longTitle) {
    this.longTitle = longTitle;
  }

  public BooksEntity bookOfTheMonth(Boolean bookOfTheMonth) {
    this.bookOfTheMonth = bookOfTheMonth;
    return this;
  }

  /**
   * Get bookOfTheMonth
   * @return bookOfTheMonth
   */
  
  @JsonProperty("bookOfTheMonth")
  public Boolean getBookOfTheMonth() {
    return bookOfTheMonth;
  }

  public void setBookOfTheMonth(Boolean bookOfTheMonth) {
    this.bookOfTheMonth = bookOfTheMonth;
  }

  public BooksEntity genres(List<String> genres) {
    this.genres = genres;
    return this;
  }

  public BooksEntity addGenresItem(String genresItem) {
    if (this.genres == null) {
      this.genres = new ArrayList<>();
    }
    this.genres.add(genresItem);
    return this;
  }

  /**
   * Get genres
   * @return genres
   */
  
  @JsonProperty("genres")
  public List<String> getGenres() {
    return genres;
  }

  public void setGenres(List<String> genres) {
    this.genres = genres;
  }

  public BooksEntity attributes(List<@Valid BooksAttributesInnerEntity> attributes) {
    this.attributes = attributes;
    return this;
  }

  public BooksEntity addAttributesItem(BooksAttributesInnerEntity attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  
  @JsonProperty("attributes")
  public List<@Valid BooksAttributesInnerEntity> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid BooksAttributesInnerEntity> attributes) {
    this.attributes = attributes;
  }

  public BooksEntity authorBooks(List<@Valid BooksAuthorBooksInnerEntity> authorBooks) {
    this.authorBooks = authorBooks;
    return this;
  }

  public BooksEntity addAuthorBooksItem(BooksAuthorBooksInnerEntity authorBooksItem) {
    if (this.authorBooks == null) {
      this.authorBooks = new ArrayList<>();
    }
    this.authorBooks.add(authorBooksItem);
    return this;
  }

  /**
   * Get authorBooks
   * @return authorBooks
   */
  
  @JsonProperty("authorBooks")
  public List<@Valid BooksAuthorBooksInnerEntity> getAuthorBooks() {
    return authorBooks;
  }

  public void setAuthorBooks(List<@Valid BooksAuthorBooksInnerEntity> authorBooks) {
    this.authorBooks = authorBooks;
  }

  public BooksEntity reviews(List<@Valid BooksReviewsInnerEntity> reviews) {
    this.reviews = reviews;
    return this;
  }

  public BooksEntity addReviewsItem(BooksReviewsInnerEntity reviewsItem) {
    if (this.reviews == null) {
      this.reviews = new ArrayList<>();
    }
    this.reviews.add(reviewsItem);
    return this;
  }

  /**
   * Get reviews
   * @return reviews
   */
  
  @JsonProperty("reviews")
  public List<@Valid BooksReviewsInnerEntity> getReviews() {
    return reviews;
  }

  public void setReviews(List<@Valid BooksReviewsInnerEntity> reviews) {
    this.reviews = reviews;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BooksEntity books = (BooksEntity) o;
    return Objects.equals(this.id, books.id) &&
        Objects.equals(this.title, books.title) &&
        Objects.equals(this.pages, books.pages) &&
        Objects.equals(this.year, books.year) &&
        Objects.equals(this.synopsis, books.synopsis) &&
        Objects.equals(this.cover, books.cover) &&
        Objects.equals(this.totalInventory, books.totalInventory) &&
        Objects.equals(this.available, books.available) &&
        Objects.equals(this.binding, books.binding) &&
        Objects.equals(this.language, books.language) &&
        Objects.equals(this.publisher, books.publisher) &&
        Objects.equals(this.longTitle, books.longTitle) &&
        Objects.equals(this.bookOfTheMonth, books.bookOfTheMonth) &&
        Objects.equals(this.genres, books.genres) &&
        Objects.equals(this.attributes, books.attributes) &&
        Objects.equals(this.authorBooks, books.authorBooks) &&
        Objects.equals(this.reviews, books.reviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, pages, year, synopsis, cover, totalInventory, available, binding, language, publisher, longTitle, bookOfTheMonth, genres, attributes, authorBooks, reviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BooksEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    synopsis: ").append(toIndentedString(synopsis)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    totalInventory: ").append(toIndentedString(totalInventory)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    binding: ").append(toIndentedString(binding)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    longTitle: ").append(toIndentedString(longTitle)).append("\n");
    sb.append("    bookOfTheMonth: ").append(toIndentedString(bookOfTheMonth)).append("\n");
    sb.append("    genres: ").append(toIndentedString(genres)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    authorBooks: ").append(toIndentedString(authorBooks)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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

