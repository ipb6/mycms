package com.pb.apps.cms.services;

import java.util.List;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.extend.BaseRoleExtend;
import com.pb.apps.cms.vm.BasePrivilegeVm;

/**

* @类说明 
* @Title IBaseRoleService.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 下午3:23:10

*/

public interface IBaseRoleService {
	
	List<BaseRole> findAll();
	
	List<BaseRoleExtend> findAllWithPrivilege();

	void authorization(BasePrivilegeVm basePrivilege);
}
