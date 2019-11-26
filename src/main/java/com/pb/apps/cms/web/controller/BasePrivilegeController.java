package com.pb.apps.cms.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pb.apps.cms.bean.BasePrivilege;
import com.pb.apps.cms.services.IBasePrivilegeService;
import com.pb.apps.cms.utils.Message;
import com.pb.apps.cms.utils.MessageUtil;
import com.pb.apps.cms.vm.PrivilegeTree;

import io.swagger.annotations.ApiOperation;

/**

* @类说明 
* @Title BasePrivilegeController.java
* @author pengbin
* @version 1.0
* @date 2019年11月20日 上午9:45:50

*/
@RestController
@RequestMapping("/privilege")
public class BasePrivilegeController {
	
	@Autowired
	private IBasePrivilegeService bpi;
	
	@ApiOperation("根据父id查询")
	@GetMapping("findPrivilegeByparentId")
	public Message findPrivilegeByparentId(Long id) {
		List<BasePrivilege> findPrivilegeByparentId = bpi.findPrivilegeByparentId(id);
		
		return MessageUtil.success(findPrivilegeByparentId);
	}
	
	
	@ApiOperation("查询权限树")
	@GetMapping("findPrivilegeTree")
	public Message findPrivilegeTree() {
		List<PrivilegeTree> findBasePrivilegeTree = bpi.findBasePrivilegeTree();
		
		return MessageUtil.success(findBasePrivilegeTree);
	}
	
	@ApiOperation("保存或更新")
	@PostMapping("saveOrUpdate")
	public Message saveOrUpdate(BasePrivilege basePrivilege) throws Exception {
		bpi.saveOrUpdate(basePrivilege);
		
		return MessageUtil.success("success");
	}
	@ApiOperation("根据id删除")
	@GetMapping("deleteById")
	public Message deleteById(Long id) throws Exception {
		bpi.deleteById(id);
		
		return MessageUtil.success("success");
	}
	
}
