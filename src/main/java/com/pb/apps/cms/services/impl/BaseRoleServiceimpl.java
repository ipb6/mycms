package com.pb.apps.cms.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.BaseRoleExample;
import com.pb.apps.cms.dao.BaseRoleMapper;
import com.pb.apps.cms.services.IBaseRoleService;

/**

* @类说明 
* @Title BaseRoleServiceimpl.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 下午3:24:18

*/
@Service
public class BaseRoleServiceimpl implements IBaseRoleService{

	@Resource
	private BaseRoleMapper baseRoleMapping;
	
	@Override
	public List<BaseRole> findAll() {
		// TODO Auto-generated method stub
		List<BaseRole> selectByExample = baseRoleMapping.selectByExample(new BaseRoleExample());
		return selectByExample;
	}

}
