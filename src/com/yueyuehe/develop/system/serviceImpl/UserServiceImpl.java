package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.UserDao;
import com.yueyuehe.develop.system.domain.User;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> {
	@Resource
	private UserDao dao;
}
