package com.pb.apps.cms.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pb.apps.cms.bean.BasePrivilege;
import com.pb.apps.cms.bean.BasePrivilegeExample;
import com.pb.apps.cms.dao.BasePrivilegeMapper;
import com.pb.apps.cms.dao.extend.BasePrivilegeExtendMapper;
import com.pb.apps.cms.services.IBasePrivilegeService;
import com.pb.apps.cms.utils.CustomerException;
import com.pb.apps.cms.vm.PrivilegeTree;

/**

* @类说明 
* @Title BasePrivilegeServiceimpl.java
* @author pengbin
* @version 1.0
* @date 2019年11月20日 上午10:04:34

*/
@Service
public class BasePrivilegeServiceimpl implements IBasePrivilegeService{
	
	@Resource
	private BasePrivilegeMapper basePrivilegeMapper;
	
	@Resource
	private BasePrivilegeExtendMapper basePrivilegeExtendMapper; 
	
	@Override
	public List<PrivilegeTree> findBasePrivilegeTree() {
		// TODO Auto-generated method stub
		List<PrivilegeTree> findBasePrivilegeTree = basePrivilegeExtendMapper.findBasePrivilegeTree();
		return findBasePrivilegeTree;
	}

	@Override
	public List<BasePrivilege> findPrivilegeByparentId(Long id) {
		// TODO Auto-generated method stub
		List<BasePrivilege> findPrivilegeByparentId = basePrivilegeExtendMapper.findPrivilegeByparentId(id);
		return findPrivilegeByparentId;
	}

	@Override
	public void saveOrUpdate(BasePrivilege basePrivilege) throws Exception {
		// TODO Auto-generated method stub
		BasePrivilegeExample bpe = new BasePrivilegeExample();
		bpe.createCriteria().andNameEqualTo(basePrivilege.getName());
		
		if(basePrivilege.getId()==null) {
			if(basePrivilegeMapper.selectByExample(bpe).size()!=0) {
				throw new CustomerException("该名称已存在");
			}else {
				basePrivilegeMapper.insert(basePrivilege);
				
			}
		}else {
			basePrivilegeMapper.updateByPrimaryKey(basePrivilege);
		}
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		basePrivilegeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<BasePrivilege> findByUserId(long userId) {
		// TODO Auto-generated method stub0\
		return basePrivilegeExtendMapper.selectByUserId(userId);
		
	}
 
}
