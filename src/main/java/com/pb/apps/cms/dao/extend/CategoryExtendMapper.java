package com.pb.apps.cms.dao.extend;
/**

* @类说明

* @Title CategoryExtendMapper.java
* @author pengbin
* @version 1.0
* @date 2019年11月17日 下午7:25:36

*/

import java.util.List;

import com.pb.apps.cms.bean.extend.CategoryExtend;

public interface CategoryExtendMapper {
	public List<CategoryExtend> findAll();
}
