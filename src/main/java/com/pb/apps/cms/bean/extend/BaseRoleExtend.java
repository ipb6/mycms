package com.pb.apps.cms.bean.extend;

import java.util.List;

import com.pb.apps.cms.bean.BasePrivilege;
import com.pb.apps.cms.bean.BaseRole;

/**

* @类说明 
* @Title BaseRoleExtend.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 下午7:41:10

*/
public class BaseRoleExtend extends BaseRole{
	private List<BasePrivilege> privileges;

	public List<BasePrivilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<BasePrivilege> privileges) {
		this.privileges = privileges;
	}
	
}
