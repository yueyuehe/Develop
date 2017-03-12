package com.yueyuehe.develop.system.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.serviceImpl.BaseServiceImpl;
import com.yueyuehe.develop.system.dao.FileResourceDao;
import com.yueyuehe.develop.system.domain.FileResource;

@Service
public class FileResourceServiceImpl extends BaseServiceImpl<FileResource>{

	@Resource
	private FileResourceDao dao;
}
