package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.RoleDao;
import com.yueyuehe.develop.system.domain.Role;
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role>{
	@Resource
	private RoleDao dao;
}
