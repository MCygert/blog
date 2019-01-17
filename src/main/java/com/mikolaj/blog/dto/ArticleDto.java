package com.mikolaj.blog.dto;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import com.mikolaj.blog.repository.ArticleRepository;
import org.hibernate.service.spi.InjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ArticleDto {
    private Long id;
    private String text;
    private Type type;
    private LocalDate created;
    private String title;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ArticleRepository articleRepository;

    private ArticleDto convertToDto(Article article) {
        return modelMapper.map(article, ArticleDto.class);
    }

    List<ArticleDto> getAllArticlesByType(Type type) {
        List<Article> articles = articleRepository.findAllByType(type);
        return articles.stream().map(this::convertToDto)
                .collect(Collectors.toList());
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
