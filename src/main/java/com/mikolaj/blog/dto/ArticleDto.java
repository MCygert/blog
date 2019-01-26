package com.mikolaj.blog.dto;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import com.mikolaj.blog.repository.ArticleRepository;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Component
public class ArticleDto {
    private Long id;
    private String text;
    private Type type;
    private LocalDate created;
    private String title;

    final private Logger logger = LoggerFactory.getLogger(ArticleDto.class);
   @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private ArticleRepository articleRepository;

    private ArticleDto convertToDto(Article article) {
        return modelMapper.map(article, ArticleDto.class);
    }

    public ArticleDto getArticleDtoById(Long id) {
       Optional<Article> article = articleRepository.findById(id);
        if (article.isPresent()) {
            logger.info("Getting article with {}", id);
            return convertToDto(article.get());
        }
        logger.info("There isn't article with {}", id);
        // TODO: Here shouldn't be null, make empty article or find another way of fixing it
        return null;
    }

   public List<ArticleDto> getAllArticlesByType(Type type) {
        List<Article> articles = articleRepository.findAllByType(type);
        logger.info("Getting all articles from {} type ", type);
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
