package com.yueyuehe.develop.base.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueyuehe.develop.base.dao.BaseDao;
import com.yueyuehe.develop.base.daoImpl.BaseDaoImpl;
import com.yueyuehe.develop.base.service.BaseService;

/**
 * 
 * @ClassName BaseServiceImpl
 * @Description TODO(BaseService实现类)
 * @author yueyuehe
 * @Date 2017年3月11日 下午9:19:05
 * @version 1.0.0
 */


public class BaseServiceImpl<T> implements BaseService<T> {

	@Resource
	private BaseDaoImpl<T> baseDao;

	@Override
	public void insert(T t) {
		baseDao.insert(t);

	}

	@Override
	public void insertBatch(List<T> list) {
		baseDao.insertBatch(list);

	}

	@Override
	public void deleteBatchById(Long[] ids) {
		// TODO Auto-generated method stub
		baseDao.deleteBatchById(ids);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		baseDao.deleteById(id);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		baseDao.update(t);
	}

	@Override
	public void update(List<T> list) {
		// TODO Auto-generated method stub
		update(list);
	}

	@Override
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return (T) baseDao.findById(id);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return baseDao.findAll();
	}

}
