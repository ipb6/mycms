package com.pb.apps.cms.services;

import java.util.List;

import com.pb.apps.cms.bean.Category;
import com.pb.apps.cms.bean.extend.CategoryExtend;

public interface ICategoryService {
	public void addOrSaveCategory(Category category);
	
	public void deleteCategoryById(long id);
	
	public void updateCategory(Category category);
	
	public List<Category> findAllCategory();

	public void deleteBatchCategory(Long[] ids);
	
	public List<CategoryExtend> findAll();
}
