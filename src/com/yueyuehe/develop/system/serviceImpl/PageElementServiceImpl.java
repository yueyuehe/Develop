package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.PageElementDao;
import com.yueyuehe.develop.system.domain.PageElement;
import com.yueyuehe.develop.system.service.PageElementService;
@Service
@Transactional
public class PageElementServiceImpl extends BaseServiceImpl<PageElement> implements PageElementService{
	@Resource
	private PageElementDao dao;
	
	@Autowired
	public void setBaseDao() {
		super.setBaseDao(dao);
	}
	
}
