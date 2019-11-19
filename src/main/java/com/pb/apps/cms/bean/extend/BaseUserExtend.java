package com.pb.apps.cms.bean.extend;

import java.util.List;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.BaseUser;

/**

* @类说明 
* @Title BaseUserExtenf.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午10:05:01

*/
public class BaseUserExtend extends BaseUser {
	private List<BaseRole> roles;

	public List<BaseRole> getRoles() {
		return roles;
	}

	public void setRoles(List<BaseRole> roles) {
		this.roles = roles;
	}
	
}
