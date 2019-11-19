package com.pb.apps.cms.services;

import com.pb.apps.cms.bean.Article;
import com.pb.apps.cms.bean.extend.ArticleExtend;
import com.pb.apps.cms.utils.CustomerException;

import java.util.List;
 
public interface IArticleService {
     
    List<Article> findAll();

    List<ArticleExtend> cascadeFindAll();

    ArticleExtend findById(long id);

    void saveOrUpdate(Article article) throws CustomerException;
    
    void deleteArticleById(Long id);
}