package com.pb.apps.cms.services;

import java.util.List;

import com.pb.apps.cms.bean.BasePrivilege;
import com.pb.apps.cms.vm.PrivilegeTree;

/**

* @类说明 
* @Title BasePrivilegeController.java
* @author pengbin
* @version 1.0
* @date 2019年11月20日 上午10:00:09

*/
public interface IBasePrivilegeService {
	List<PrivilegeTree> findBasePrivilegeTree();
	
	List<BasePrivilege> findPrivilegeByparentId(Long id);

	void saveOrUpdate(BasePrivilege basePrivilege) throws Exception;

	void deleteById(Long id);

	List<BasePrivilege> findByUserId(long userId); 
}
