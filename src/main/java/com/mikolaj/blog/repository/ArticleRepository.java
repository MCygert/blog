package com.mikolaj.blog.repository;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findAllByType(Type type);

}
