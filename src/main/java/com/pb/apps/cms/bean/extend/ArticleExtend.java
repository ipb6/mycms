package com.pb.apps.cms.bean.extend;


import java.util.List;

import com.pb.apps.cms.bean.Article;
import com.pb.apps.cms.bean.Category;
import com.pb.apps.cms.bean.Comment;

public class ArticleExtend extends Article{
	public static final String STATUS_UNCHECK="未审核";
	
	public static final String STATUC_PASS="审核通过";
	
	private Category category;
	 private List<Comment> comments; 


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
	
	
	
}
