package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.PageElementDao;
import com.yueyuehe.develop.system.domain.PageElement;
@Service
public class PageElementServiceImpl extends BaseServiceImpl<PageElement>{
	@Resource
	private PageElementDao dao;
}
