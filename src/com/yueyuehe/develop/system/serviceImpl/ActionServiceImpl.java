package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.domain.Action;
import com.yueyuehe.develop.system.service.ActionService;

@Service
@Transactional 
public class ActionServiceImpl extends BaseServiceImpl<Action> implements ActionService{

//	@Resource(name="ActionDaoImpl")
//	private ActionDao dao;
}
