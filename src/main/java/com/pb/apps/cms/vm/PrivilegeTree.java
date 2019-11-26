package com.pb.apps.cms.vm;

import java.util.List;

import com.pb.apps.cms.bean.BasePrivilege;

/**

* @类说明 
* @Title PrivilegeTree.java
* @author pengbin
* @version 1.0
* @date 2019年11月20日 上午9:43:18

*/
public class PrivilegeTree extends BasePrivilege{
	private List<BasePrivilege> children;

	public List<BasePrivilege> getChildren() {
		return children;
	}

	public void setChildren(List<BasePrivilege> children) {
		this.children = children;
	}
	
	
}
