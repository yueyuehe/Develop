package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.ActionDao;
import com.yueyuehe.develop.system.domain.Action;

@Service
@Transactional
public class ActionServiceImpl extends BaseServiceImpl<Action>{

	@Resource
	private ActionDao dao;
}
