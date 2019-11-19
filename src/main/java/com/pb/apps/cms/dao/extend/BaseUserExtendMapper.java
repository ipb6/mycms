package com.pb.apps.cms.dao.extend;

import java.util.List;

import com.pb.apps.cms.bean.extend.BaseUserExtend;

/**

* @类说明 
* @Title BaseUserExtendMApper.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午10:08:43

*/
public interface BaseUserExtendMapper {
	//通过id查找user
	public BaseUserExtend findById(Long id);
	
	//查找所有user
	public List<BaseUserExtend> findAll();
}
