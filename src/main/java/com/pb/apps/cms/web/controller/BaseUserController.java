package com.pb.apps.cms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.BaseUser;
import com.pb.apps.cms.bean.extend.BaseUserExtend;
import com.pb.apps.cms.services.IBaseUserService;
import com.pb.apps.cms.utils.Message;
import com.pb.apps.cms.utils.MessageUtil;
import com.pb.apps.cms.vm.BaseRoleVm;

/**

* @类说明 
* @Title BaseUserController.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午11:25:10

*/
@RestController
@RequestMapping("/baseuser")
public class BaseUserController {
	
	@Autowired
	private IBaseUserService iBaseUserService;
	
	//查找所有用户
	@GetMapping("findAll")
	public Message findAll() {
		List<BaseUserExtend> findAll = iBaseUserService.findAll();
		return MessageUtil.success(findAll);
	}
	
	//根据id删除用户
	@GetMapping("deleteById")
	public Message deleteById(Long id) {
		iBaseUserService.deleteById(id);
		return MessageUtil.success("删除成功");
	}
	
	//保存或更新用户信息
	@PostMapping("saveOrUpdate")
	public Message saveOrUpdate(BaseUser user) {
		iBaseUserService.saveOrUpdate(user);
		return MessageUtil.success("成功");
	}
	
	//设置用户角色
	@PostMapping("setRoles")
	public Message setRoles(BaseRoleVm uservm) {
		iBaseUserService.setRoles(uservm);
	    return MessageUtil.success("设置成功");
	}
	
	
	
}
