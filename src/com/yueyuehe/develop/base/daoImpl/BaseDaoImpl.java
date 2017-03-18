package com.yueyuehe.develop.base.daoImpl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yueyuehe.develop.base.dao.BaseDao;

/**
 * 
 * @ClassName BaseDaoImpl
 * @Description TODO(BaseDao实现类)
 * @author yueyuehe
 * @Date 2017年3月11日 下午9:16:33
 * @version 1.0.0
 */

@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {

	@Resource
	private SessionFactory sessionFactory;

	private Class clazz = null;

	public BaseDaoImpl() {
		super();
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz = (Class) type.getActualTypeArguments()[0];

		// TODO Auto-generated constructor stub
	}

	/**
	 * 得到当前线程的session对象
	 * 
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @return
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void insert(T t) {
		getSession().save(t);

	}

	@Override
	public void insertBatch(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			getSession().save(list.get(i));
			if (i % 20 == 0) {
				getSession().flush();
				getSession().clear();
			}
		}

	}

	@Override
	public void deleteBatchById(Long[] ids) {
		for (int i = 0; i < ids.length; i++) {
			getSession().delete(ids[i]);
			if (i % 20 == 0) {
				getSession().flush();
				getSession().clear();
			}
		}

	}

	@Override
	public void deleteById(Long id) {
		getSession().delete(id);

	}

	@Override
	public void update(T t) {
		getSession().update(t);

	}

	@Override
	public void update(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			getSession().update(list.get(i));
			if (i % 20 == 0) {
				getSession().flush();
				getSession().clear();
			}
		}

	}

	@Override
	public T findById(Long id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		return getSession().createQuery("from "+clazz.getSimpleName()).list();
	}

}
