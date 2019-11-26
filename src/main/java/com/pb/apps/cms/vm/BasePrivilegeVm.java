package com.pb.apps.cms.vm;
/**

* @类说明 
* @Title BasePrivilegeVm.java
* @author pengbin
* @version 1.0
* @date 2019年11月24日 下午3:32:51

*/

import java.util.List;

public class BasePrivilegeVm {
	private Long id;
	private List<Long> privileges;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Long> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Long> privileges) {
		this.privileges = privileges;
	}
	
}
