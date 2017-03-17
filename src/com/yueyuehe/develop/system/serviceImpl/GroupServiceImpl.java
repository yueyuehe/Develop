package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.GroupDao;
import com.yueyuehe.develop.system.domain.Group;
import com.yueyuehe.develop.system.service.GroupService;
@Service
@Transactional
public class GroupServiceImpl extends BaseServiceImpl<Group> implements GroupService{
//	@Resource(name="GroupDaoImpl")
//	private GroupDao dao;
}
