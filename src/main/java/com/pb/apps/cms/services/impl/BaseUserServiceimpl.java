package com.pb.apps.cms.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pb.apps.cms.bean.BaseUser;
import com.pb.apps.cms.bean.UserRole;
import com.pb.apps.cms.bean.UserRoleExample;
import com.pb.apps.cms.bean.extend.BaseUserExtend;
import com.pb.apps.cms.dao.BaseUserMapper;
import com.pb.apps.cms.dao.UserRoleMapper;
import com.pb.apps.cms.dao.extend.BaseUserExtendMapper;
import com.pb.apps.cms.services.IBaseUserService;
import com.pb.apps.cms.vm.BaseRoleVm;

/**

* @类说明 
* @Title BaseUserServiceimpl.java
* @author pengbin
* @version 1.0
* @date 2019年11月19日 上午10:07:37

*/
@Service
public class BaseUserServiceimpl implements IBaseUserService{
	
	@Resource
	private BaseUserExtendMapper baseUserExtendMapper;
	
	@Resource
	private BaseUserMapper baseUserMapper;
	
	@Resource
	private UserRoleMapper userRoleMApper;
	
	@Override
	public BaseUserExtend findById(Long id) {
		// TODO Auto-generated method stub
		BaseUserExtend findById = baseUserExtendMapper.findById(id);
		return findById;
	}

	@Override
	public List<BaseUserExtend> findAll() {
		// TODO Auto-generated method stub
		List<BaseUserExtend> findAll = baseUserExtendMapper.findAll();
		return findAll;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		baseUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void saveOrUpdate(BaseUser user) {
		// TODO Auto-generated method stub
		if(user.getId()==null) {
			baseUserMapper.insert(user);
		}else {
			baseUserMapper.updateByPrimaryKey(user);
		}
	}

	@Override
	public void setRoles(BaseRoleVm uservm) {
		// TODO Auto-generated method stub
		long id = uservm.getId();
		UserRoleExample ur=new UserRoleExample();
		ur.createCriteria().andUserIdEqualTo(id);
		//获取要修改的用户的老角色
		List<UserRole> userRoles = userRoleMApper.selectByExample(ur);
		//获取要修改的新角色
		List<Long> newlist = uservm.getRoles();
		List<Long> oldlist = new ArrayList<>();
		//将没有的角色删除
		for (UserRole userRole : userRoles) {
			if(newlist.contains(userRole.getRoleId())) {
				userRoleMApper.deleteByPrimaryKey(userRole.getId());
			}else {
				oldlist.add(userRole.getRoleId());
			}
		}
		//将新的角色插入数据库
		for (Long role : newlist) {
			if(!oldlist.contains(role)) {
				UserRole userRole = new UserRole();
				userRole.setRoleId(role);
				userRole.setUserId(id);
				userRoleMApper.insert(userRole);	
			}
		}	
	}

}
