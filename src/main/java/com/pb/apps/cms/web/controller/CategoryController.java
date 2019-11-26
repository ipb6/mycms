package com.pb.apps.cms.web.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.apps.cms.bean.Category;
import com.pb.apps.cms.bean.extend.CategoryExtend;
import com.pb.apps.cms.services.ICategoryService;
import com.pb.apps.cms.utils.Message;
import com.pb.apps.cms.utils.MessageUtil;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	private ICategoryService ics;
	
	
	@ApiOperation("新增或更新")
	@PostMapping("addOrSaveCategory")
	public Message addCategory(Category category) {
		
		ics.addOrSaveCategory(category);
		return MessageUtil.success("添加成功");
	}
	
	
	@ApiOperation("根据id删除")
	@GetMapping("deleteCategoryById")
	public Message deleteCategoryById(int id) {
		ics.deleteCategoryById(id);
		return MessageUtil.success("删除成功");
	}
	
	
	@ApiOperation("批量删除")
	@PostMapping("deleteBatchCategory")
	public Message deleteBatchCategory(@RequestBody Long[] ids) {
		//ics.dele
		ics.deleteBatchCategory(ids);
		return MessageUtil.success("删除成功");
	}
	
	@ApiOperation("更新")
	@GetMapping("updateCategory")
	public Message updateCategory(Category category) {
		ics.updateCategory(category);
		return MessageUtil.success("更新成功");
	}
	
	@ApiOperation("查找所有")
	@GetMapping("findAllCategory")
	public Message findAllCategory() {
		List<Category> findAllCategory = ics.findAllCategory();
		return MessageUtil.success(findAllCategory);
	}
	
	@ApiOperation("查找所有（包含父项）")
	@GetMapping("findAll")
	public Message findAll() {
		List<CategoryExtend> findAll = ics.findAll();
		return MessageUtil.success(findAll);
	}
	
	
}
