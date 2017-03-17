package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.RightDao;
import com.yueyuehe.develop.system.domain.Right;
import com.yueyuehe.develop.system.service.RightService;
@Service
@Transactional
public class RightServiceImpl extends BaseServiceImpl<Right> implements RightService{
//	@Resource(name="RightDaoImpl")
//	private RightDao dao;
}
