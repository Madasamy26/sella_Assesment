package com.assesment.dao;
import java.util.List;

import com.assesment.entity.Article;
public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
   
    boolean articleExists(String title, String category);
}
 