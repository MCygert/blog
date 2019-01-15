package com.mikolaj.blog.component;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import com.mikolaj.blog.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.ParseException;
import java.time.LocalDate;

@Component
public class InsertArticlesComponent {
    private final ArticleRepository articleRepository;

    @Autowired
    public InsertArticlesComponent(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @PostConstruct
    public void fillData() throws ParseException {
        Article article1 = new Article("LOREM IPSUM", Type.LIFE, LocalDate.now());
        Article article2 = new Article("LOREM IPSUM LOREM IPSUMLOREM IPSUMLOREM IPSUM", Type.TECH, LocalDate.now());
        articleRepository.save(article1);
        articleRepository.save(article2);
    }
}
