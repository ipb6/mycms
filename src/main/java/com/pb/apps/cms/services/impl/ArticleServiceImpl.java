package com.pb.apps.cms.services.impl;

import com.pb.apps.cms.bean.Article;
import com.pb.apps.cms.bean.ArticleExample;
import com.pb.apps.cms.bean.extend.ArticleExtend;
import com.pb.apps.cms.dao.ArticleMapper;
import com.pb.apps.cms.dao.extend.ArticleExtendMapper;
import com.pb.apps.cms.services.IArticleService;
import com.pb.apps.cms.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @program: cms_jd1911
 * @description: 文章的业务实现类
 * @author: charles
 * @create: 2019-11-12 10:21
 **/
@Service
public class ArticleServiceImpl implements IArticleService {
    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ArticleExtendMapper articleExtendMapper;

    @Override
    public List<Article> findAll() {
        return articleMapper.selectByExample(new ArticleExample());
    }

    @Override
    public List<ArticleExtend> cascadeFindAll() {
        return articleExtendMapper.selectAll();
    }

    @Override
    public ArticleExtend findById(long id) {
        return articleExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Article article) throws CustomerException {
        if(article.getId()!=null){
            articleMapper.updateByPrimaryKey(article);
        } else {
            // 标题不能重名
            ArticleExample example = new ArticleExample();
            example.createCriteria().andTitleEqualTo(article.getTitle());

            List<Article> articles = articleMapper.selectByExample(example);
            if(articles.size()>0){
                throw new CustomerException("标题不能重复");
            }
            // 初始化
            article.setPublishTime(new Date().getTime());
            article.setStatus(ArticleExtend.STATUS_UNCHECK);
            article.setThumpDown(0l);
            article.setThumpUp(0l);
            articleMapper.insert(article);
        }
    }

	@Override
	public void deleteArticleById(Long id) {
		// TODO Auto-generated method stub
		articleMapper.deleteByPrimaryKey(id);
	}
}