package com.pb.apps.cms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.extend.BaseRoleExtend;
import com.pb.apps.cms.services.IBaseRoleService;
import com.pb.apps.cms.utils.Message;
import com.pb.apps.cms.utils.MessageUtil;
import com.pb.apps.cms.vm.BasePrivilegeVm;

import io.swagger.annotations.ApiOperation;

/**

* @类说明 
* @Title BaseRoleController.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 下午3:19:25

*/
@RestController
@RequestMapping("/role")
public class BaseRoleController {
	
	@Autowired
	private IBaseRoleService ibrs; 
	
	
	@ApiOperation(value = "查找所有角色")
	@GetMapping("findAll")
	public Message getAllRole() {
		List<BaseRole> findAll = ibrs.findAll();
		return MessageUtil.success(findAll);
	}
	
	@ApiOperation(value = "查找所有角色及其权限")
	@GetMapping("findAllWithPrivilege")
	public Message findAllWithPrivilege() {
		List<BaseRoleExtend> findAllWithPrivilege = ibrs.findAllWithPrivilege();
		return MessageUtil.success(findAllWithPrivilege);
	}
	
	@ApiOperation(value = "授权")
	@PostMapping("authorization")
	public Message authorization(BasePrivilegeVm basePrivilege) {
		ibrs.authorization(basePrivilege);
		return MessageUtil.success("授权成功");
	}
	
}
