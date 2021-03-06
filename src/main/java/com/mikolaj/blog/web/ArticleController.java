package com.mikolaj.blog.web;

import com.mikolaj.blog.model.Article;
import com.mikolaj.blog.model.Type;
import com.mikolaj.blog.repository.ArticleRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class ArticleController {
    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @GetMapping("/articles")
    public String getAllArticlesByType(Model model, @RequestParam(value = "type", required = true) Type type) {
        List<Article> articles  = articleRepository.findAllByType(type);
        model.addAttribute("articles", articles);
        return "articles";
    }

}
