package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.ActionDao;
import com.yueyuehe.develop.system.domain.Action;
import com.yueyuehe.develop.system.service.ActionService;

@Service
@Transactional 
public class ActionServiceImpl extends BaseServiceImpl<Action> implements ActionService{

	@Resource
	private ActionDao dao;

	@Autowired
	public void setBaseDao() {
		super.setBaseDao(dao);
	}
	
	
}
