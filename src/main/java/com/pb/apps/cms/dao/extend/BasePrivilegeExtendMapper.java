package com.pb.apps.cms.dao.extend;

import java.util.List;

import com.pb.apps.cms.bean.BasePrivilege;
import com.pb.apps.cms.vm.PrivilegeTree;

/**

* @类说明 
* @Title BasePrivilegeExtendMapper.java
* @author pengbin
* @version 1.0
* @date 2019年11月20日 上午10:05:55

*/
public interface BasePrivilegeExtendMapper {
	
	
	public List<PrivilegeTree> findBasePrivilegeTree();
	
	public List<BasePrivilege> findPrivilegeByparentId(Long id);
	
	public BasePrivilege findByRoleId(Long id);

	public List<BasePrivilege> selectByUserId(long userId);
}
