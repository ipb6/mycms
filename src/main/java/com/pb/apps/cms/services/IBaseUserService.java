package com.pb.apps.cms.services;
/**

* @类说明 
* @Title IBaseUserService.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午10:00:07

*/

import java.util.List;

import com.pb.apps.cms.bean.BaseUser;
import com.pb.apps.cms.bean.extend.BaseUserExtend;
import com.pb.apps.cms.vm.BaseRoleVm;
import com.pb.apps.cms.vm.UserVM;

public interface IBaseUserService {
	
	//通过id查找user(包括角色)
	BaseUserExtend findById(Long id);
	
	//查找所有user(包括角色)
	List<BaseUserExtend> findAll();
	
	//根据id删除用户
	void deleteById(Long id);
	
	//新增或更改用户信息
	void saveOrUpdate(BaseUser user);

	//给用户设置角色
	void setRoles(BaseRoleVm uservm);

	BaseUser login(UserVM userVM);
	
}
