package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.MenuDao;
import com.yueyuehe.develop.system.domain.Menu;
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu>{
	@Resource
	private MenuDao dao;
}
