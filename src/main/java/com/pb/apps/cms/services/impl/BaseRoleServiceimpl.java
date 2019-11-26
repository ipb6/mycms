package com.pb.apps.cms.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pb.apps.cms.bean.BaseRole;
import com.pb.apps.cms.bean.BaseRoleExample;
import com.pb.apps.cms.bean.RolePrivilege;
import com.pb.apps.cms.bean.RolePrivilegeExample;
import com.pb.apps.cms.bean.extend.BaseRoleExtend;
import com.pb.apps.cms.dao.BaseRoleMapper;
import com.pb.apps.cms.dao.RolePrivilegeMapper;
import com.pb.apps.cms.dao.extend.BaseRoleExtendMapper;
import com.pb.apps.cms.services.IBaseRoleService;
import com.pb.apps.cms.vm.BasePrivilegeVm;

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
	
	@Resource
	private BaseRoleExtendMapper baseRoleExtendMapper;
	
	@Resource
	private RolePrivilegeMapper rolePrivilegeMapper;
	
	@Override
	public List<BaseRole> findAll() {
		// TODO Auto-generated method stub
		List<BaseRole> selectByExample = baseRoleMapping.selectByExample(new BaseRoleExample());
		return selectByExample;
	}

	@Override
	public List<BaseRoleExtend> findAllWithPrivilege() {
		// TODO Auto-generated method stub
		List<BaseRoleExtend> findAllWithPrivilege = baseRoleExtendMapper.findAllWithPrivilege();
		return findAllWithPrivilege;
	}

	@Override
	public void authorization(BasePrivilegeVm basePrivilege) {
		// TODO Auto-generated method stub
		Long id = basePrivilege.getId();
		List<Long> newList = basePrivilege.getPrivileges();
		List<Long> oldList = new ArrayList<>();
		RolePrivilegeExample rpe = new RolePrivilegeExample();
		rpe.createCriteria().andRoleIdEqualTo(id);
		List<RolePrivilege> selectByExample = rolePrivilegeMapper.selectByExample(rpe);
		for (RolePrivilege rolePrivilege : selectByExample) {
			oldList.add(rolePrivilege.getPrivilegeId());
			if(!newList.contains(rolePrivilege.getPrivilegeId())) {
				rolePrivilegeMapper.deleteByPrimaryKey(rolePrivilege.getId());
			}
		}
		for (Long privilegeId : newList) {
			if(!oldList.contains(privilegeId)) {
				RolePrivilege rp = new RolePrivilege();
				rp.setRoleId(id);
				rp.setPrivilegeId(privilegeId);
				rolePrivilegeMapper.insert(rp);
			}
		}
		
		
	}

}
