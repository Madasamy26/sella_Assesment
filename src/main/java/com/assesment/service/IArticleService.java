package com.assesment.service;

import java.util.List;

import com.assesment.entity.Article;

public interface IArticleService {
     List<Article> getAllArticles();
     Article getArticleById(int articleId);
     boolean addArticle(Article article);
   
}
