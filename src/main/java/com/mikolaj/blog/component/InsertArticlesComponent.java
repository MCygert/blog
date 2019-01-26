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
        Article article1 = new Article("LOREM IPSUM", Type.LIFE, LocalDate.now(), "Test Title Life1 ");
        Article article3 = new Article("LOREM IPSUM fdsgfdgfdgsd", Type.LIFE, LocalDate.now(), "Test Title Life2 ");
        Article article4 = new Article("LOREM IPSUM fafasgwadas", Type.LIFE, LocalDate.now(), "Test Title Life3 ");

        Article article2 = new Article("LOREM IPSUM LOREM IPSUMLOREM IPSUMLOREM IPSUM", Type.TECH, LocalDate.now(), "Test Title Tech1");
        Article article5 = new Article("LOREM IPSUM LOREM IPSUMLOREM IPSUMLOREM IPSUM gasdsa", Type.TECH, LocalDate.now(), "Test Title Tech2");
        Article article6 = new Article("LOREM IPSUM LOREM IPSUMLOREM IPSUMLOREM IPSUM fsagasg", Type.TECH, LocalDate.now(), "Test Title Tech3");
        articleRepository.save(article1);
        articleRepository.save(article3);
        articleRepository.save(article4);
        articleRepository.save(article2);
        articleRepository.save(article5);
        articleRepository.save(article6);
    }
}
