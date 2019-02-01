package com.mikolaj.blog.repository;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findAllByType(Type type);

}
