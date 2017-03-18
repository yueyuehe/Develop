package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.UserDao;
import com.yueyuehe.develop.system.domain.User;
import com.yueyuehe.develop.system.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	@Resource
	private UserDao dao;
	
	@Autowired
	public void setBaseDao() {
		super.setBaseDao(dao);
	}
}
