package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.RightDao;
import com.yueyuehe.develop.system.domain.Right;
@Service
public class RightServiceImpl extends BaseServiceImpl<Right>{
	@Resource
	private RightDao dao;
}
