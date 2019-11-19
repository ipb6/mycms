package com.pb.apps.cms.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pb.apps.cms.bean.Category;
import com.pb.apps.cms.bean.CategoryExample;
import com.pb.apps.cms.bean.extend.CategoryExtend;
import com.pb.apps.cms.dao.CategoryMapper;
import com.pb.apps.cms.dao.extend.CategoryExtendMapper;
import com.pb.apps.cms.services.ICategoryService;

@Service
public class CategoryServiceimpl implements ICategoryService{
	
	@Resource
	private CategoryMapper categorymapping;
	
	@Resource
	private CategoryExtendMapper categoryextendmapping;
	
	@Override
	public void addOrSaveCategory(Category category) {
		// TODO Auto-generated method stub
		if(category.getId()==null) {
			categorymapping.insert(category);
		} else {
				categorymapping.updateByPrimaryKey(category);}
		
	}

	@Override
	public void deleteCategoryById(long id) {
		// TODO Auto-generated method stub
		categorymapping.deleteByPrimaryKey(id);
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		categorymapping.updateByPrimaryKey(category);
	}

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		List<Category> selectByExample = categorymapping.selectByExample(new CategoryExample());
		return selectByExample;
	}

	@Override
	public void deleteBatchCategory(Long[] ids) {
		// TODO Auto-generated method stub
		for (Long id : ids) {
			categorymapping.deleteByPrimaryKey(id);
		}
	}

	@Override
	public List<CategoryExtend> findAll() {
		// TODO Auto-generated method stub
		List<CategoryExtend> findAll = categoryextendmapping.findAll();
		return findAll;
	}

}
