package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.GroupDao;
import com.yueyuehe.develop.system.domain.Group;
@Service
public class GroupServiceImpl extends BaseServiceImpl<Group>{
	@Resource
	private GroupDao dao;
}
