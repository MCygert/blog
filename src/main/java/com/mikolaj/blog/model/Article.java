package com.mikolaj.blog.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.time.LocalDate;

@Entity
@Table(name = "ARTICLES")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private Long id;
    private String text;
    private Type type;
    private LocalDate created;
    private String title;

    public Article(String text, Type type, LocalDate created, String title) {
        this.text = text;
        this.type = type;
        this.created = created;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", type=" + type +
                ", created=" + created +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Article() {
    }


}
