package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.RoleDao;
import com.yueyuehe.develop.system.domain.Role;
import com.yueyuehe.develop.system.service.RoleService;
@Service
@Transactional
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{
	@Resource
	private RoleDao dao;
	
	@Autowired
	public void setBaseDao() {
		super.setBaseDao(dao);
	}
}
