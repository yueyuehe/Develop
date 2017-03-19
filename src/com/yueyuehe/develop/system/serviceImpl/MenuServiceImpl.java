package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.MenuDao;
import com.yueyuehe.develop.system.domain.Menu;
import com.yueyuehe.develop.system.service.MenuService;
@Service
@Transactional
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService{
	@Resource
	private MenuDao dao;
	
	
	public  MenuServiceImpl() {
		super.setBaseDao(dao);
	}
}
