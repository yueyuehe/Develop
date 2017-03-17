package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.PageElementDao;
import com.yueyuehe.develop.system.domain.PageElement;
import com.yueyuehe.develop.system.service.PageElementService;
@Service
@Transactional
public class PageElementServiceImpl extends BaseServiceImpl<PageElement> implements PageElementService{
//	@Resource(name="PageElementDaoImpl")
//	private PageElementDao dao;
}
