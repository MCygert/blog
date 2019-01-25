package com.mikolaj.blog.web;

import com.mikolaj.blog.dto.ArticleDto;
import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ArticleController {
    private final ArticleDto articleDto;

    public ArticleController(ArticleDto articleDto) {
        this.articleDto = articleDto;
    }


    @GetMapping("/articles")
    public String getAllArticlesByType(Model model, @RequestParam(value = "type", required = true) Type type) {
        List<ArticleDto> articles = articleDto.getAllArticlesByType(type);
        model.addAttribute("articles", articles);
        return "articles";
    }

    @GetMapping("/articles/{id}")
    public String getSingleArticle(Model model, @RequestParam(value = "id") long id) {
        
    }

}
