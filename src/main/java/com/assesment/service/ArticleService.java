package com.assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.dao.IArticleDAO;
import com.assesment.entity.Article;
@Service
public class ArticleService implements IArticleService {
	@Autowired
	private IArticleDAO articleDAO;
	@Override
	public Article getArticleById(int articleId) {
		Article obj = articleDAO.getArticleById(articleId);
		return obj;
	}	
	@Override
	public List<Article> getAllArticles(){
		return articleDAO.getAllArticles();
	}
	@Override
	public synchronized boolean addArticle(Article article){
       if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
    	   return false;
       } else {
    	   articleDAO.addArticle(article);
    	   return true;
       }
	}

}
