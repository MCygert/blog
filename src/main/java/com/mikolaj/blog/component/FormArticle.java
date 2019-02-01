package com.mikolaj.blog.component;

import org.springframework.stereotype.Component;

@Component
public class FormArticle {
    private String techType;
    private String title;
    private String text;


    public FormArticle() {
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
