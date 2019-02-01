package com.mikolaj.blog.web;

import com.mikolaj.blog.dto.FormArticle;
import com.mikolaj.blog.dto.ArticleDto;
import com.mikolaj.blog.model.Type;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @GetMapping("/article")
    public String getSingleArticle(Model model, @RequestParam("id") long id) {
        model.addAttribute("article", articleDto.getArticleDtoById(id));
        return "article";
    }

    @GetMapping("/article/form")
    public String getArticleForm(Model model) {
        return "form";
    }

    @PostMapping("/article/form")
    public String postArticle(@Valid @ModelAttribute("formArticle") FormArticle formArticle) {
         articleDto.saveArticleDto(articleDto.mapFormArticleToDto(formArticle));
        return "result";
    }

    @GetMapping("/article/update")
    public String updateArticle(Model model, @RequestParam("id") long id) {
        model.addAttribute("article", articleDto.getArticleDtoById(id));
        return "update";
    }

    @PutMapping("/article/update")
    public String updateArticle(@Valid @ModelAttribute("ArticleDto") ArticleDto articleDto) {
        articleDto.saveArticleDto(articleDto);
        return "result";
    }

}
