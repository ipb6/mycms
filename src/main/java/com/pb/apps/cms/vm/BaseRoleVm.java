package com.pb.apps.cms.vm;

import java.util.List;

/**

* @类说明 
* @Title BaseRoleVm.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 下午4:05:48

*/
public class BaseRoleVm {
	private long id;
	private List<Long> roles;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Long> getRoles() {
		return roles;
	}
	public void setRoles(List<Long> roles) {
		this.roles = roles;
	}
	
}
