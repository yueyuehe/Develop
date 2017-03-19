package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.FileResourceDao;
import com.yueyuehe.develop.system.domain.FileResource;
import com.yueyuehe.develop.system.service.FileResourceService;

@Service
@Transactional
public class FileResourceServiceImpl extends BaseServiceImpl<FileResource> implements FileResourceService {

	@Resource
	private FileResourceDao dao;

	public FileResourceServiceImpl() {
		super.setBaseDao(dao);
	}
}
